package com.stacktest.hcd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.hateoas.PagedResources;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.microsoft.sqlserver.jdbc.StringUtils;
import com.stacktest.hcd.dto.AutentificacionDto;

public class HCDConnection {
	// private String urlHost = "http://localhost:8080/saludServer";
	private String urlHost = "http://64.215.200.200:8080/saludServer";
	// private String urlHost = "http://192.168.10.92:8080/saludServer";
	// private String urlHost = "http://192.168.0.104:8080/saludServer";

	private String codificacion = "UTF-8";
	private HashMap<String, String> parametros;
	private String jsonResponse;
	private String method;
	private String mjePost;
	private GsonBuilder gBuilder;
	private String token;

	public HCDConnection(String username, String password) {
		parametros = new HashMap<>();
		gBuilder = new GsonBuilder().setDateFormat("dd-MM-yyyy HH:mm:ss");
		autentificar(username, password);
	}

	public void setHost(String url) {
		urlHost = url;
	}

	public void setMensajePost(String mensaje) {
		mjePost = mensaje;
	}

	public void setMensajePost(Object jsonElement) {
		mjePost = gBuilder.create().toJson(jsonElement);
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void agregarParametroGet(String clave, String valor) {
		parametros.put(clave, valor);
	}

	public void agregarParametroGet(String clave, int valor) {
		parametros.put(clave, String.valueOf(valor));
	}

	public GsonBuilder getGsonBuilder() {
		return gBuilder;
	}

	public <T> T ejecutar(String method, String urlPart, Class<T> type) {
		this.method = method;
		String url = urlHost + urlPart;
		T res = null;
		HttpURLConnection conn = null;

		try {
			// Genero los datos de conexi�n
			conn = crearConexion(url);
			conn.connect();

			// Obtengo la respuesta
			InputStream in = new BufferedInputStream(conn.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, codificacion));

			// Uno y deserealizo la respuesta separada or �neas
			List<String> lineas = new ArrayList<>();
			String linea;
			while ((linea = reader.readLine()) != null)
				lineas.add(linea);

			jsonResponse = "";
			for (int i = 0; i < lineas.size(); i++) {
				jsonResponse += lineas.get(i);
				if (i < lineas.size() - 1)
					jsonResponse += System.getProperty("line.separator");
			}

			res = gBuilder.create().fromJson(jsonResponse, type);
		} catch (ConnectException e) {
			e.printStackTrace();
		} catch (SocketTimeoutException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null && conn.getResponseCode() != 200) {
					InputStream in = new BufferedInputStream(conn.getErrorStream());
					BufferedReader reader = new BufferedReader(new InputStreamReader(in, codificacion));

					String linea;
					while ((linea = reader.readLine()) != null)
						LoggerFactory.getLogger(this.getClass()).debug(linea);

					assert false;
				}
			} catch (Exception e) {
				e.printStackTrace();
				assert false;
			}
		}

		return res;
	}

	private void autentificar(String username, String password) {
		try {
			int nroDocumento = Integer.parseInt(username.substring(0, username.length() - 1));
			boolean isMasculino = username.substring(username.length() - 1, username.length()).equalsIgnoreCase("M");

			String pathFile = getClass().getClassLoader().getResource("application.properties").getFile()
					.replace("application.properties", "autentificaciones.json");

			File file = new File(pathFile);

			if (!file.exists())
				file.createNewFile();

			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);

			String json = StringUtils.EMPTY;
			String line;
			while ((line = br.readLine()) != null)
				json += line;

			br.close();

			AutentificacionDto[] autentificaciones = new Gson().fromJson(json, AutentificacionDto[].class);
			List<AutentificacionDto> lista = new ArrayList<>();

			AutentificacionDto dto = null;

			if (autentificaciones != null) {
				for (int i = 0; i < autentificaciones.length; i++) {
					if (autentificaciones[i].getNroDocumento() == nroDocumento)
						dto = autentificaciones[i];

					lista.add(autentificaciones[i]);
				}
			}

			// Valido que exista yque la diferencia en tiempo es menor igual a 4hs
			if (dto != null && (new Date().getTime() - dto.getFecha().getTime()) <= (4 * 60 * 60 * 1000)) {
				token = dto.getBearer();
			} else {
				actualizarToken(username, password);

				if (dto != null)
					lista.remove(dto);

				dto = new AutentificacionDto();
				dto.setBearer(token);
				dto.setFecha(new Date());
				dto.setMasculino(isMasculino);
				dto.setNroDocumento(nroDocumento);

				lista.add(dto);

				json = new Gson().toJson(lista);

				FileOutputStream outputStream = new FileOutputStream(pathFile);
				byte[] strToBytes = json.getBytes();
				outputStream.write(strToBytes);

				outputStream.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			assert false;
		}
	}

	private void actualizarToken(String username, String password) {
		UserPassDTO upDto = new UserPassDTO(username, password);
		mjePost = gBuilder.create().toJson(upDto);
		ResLoginDTO[] dto = ejecutar("GET", "/token/login/temporal", ResLoginDTO[].class);
		token = dto[0].authToken.token;
		mjePost = null;
	}

	public <T> T ejecutarForPagedResources(String method, String urlPart, Class<T> itemType) {
		T res = null;
		try {
			Gson gson = gBuilder.create();
			@SuppressWarnings("rawtypes")
			PagedResources pr = ejecutar(method, urlPart, PagedResources.class);
			String json = gson.toJson(pr.getContent());
			res = gson.fromJson(json, itemType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	private String serealizarParametros() {
		String res = "";
		for (String clave : parametros.keySet()) {
			String valor = parametros.get(clave);
			try {
				valor = URLEncoder.encode(parametros.get(clave), codificacion);
			} catch (UnsupportedEncodingException e) {
				assert false;
			}
			res += String.format("%s%s=%s", res.length() > 0 ? "&" : "", clave, valor);
		}
		return res;
	}

	private HttpURLConnection crearConexion(String url) throws Exception {
		// Si hay par�metros se los agrego a la url
		if (parametros.size() > 0)
			url += "?" + serealizarParametros();

		// Creo la conexi�n
		HttpURLConnection res = (HttpURLConnection) new URL(url).openConnection();

		// Agrego las cabeceras
		res.setRequestProperty("Accept-Charset", codificacion);
		res.setRequestProperty("Content-type", "application/json");
		res.setRequestProperty("Accept", "application/json, text/plain, */*");

		if (token != null)
			res.setRequestProperty("X-Authorization", "Bearer " + token);

		// Seteo los tiempos de conexi�n y la abro
		res.setConnectTimeout(30 * 1000);
		res.setReadTimeout(60 * 1000);
		res.setDoOutput(true);
		res.setRequestMethod(method);

		// Si hay mensaje post se lo agrego
		if (mjePost != null) {
			DataOutputStream wr = new DataOutputStream(res.getOutputStream());
			wr.writeBytes(mjePost);
			wr.flush();
			wr.close();
		}

		return res;
	}

	public class GenericClass<T> {

		private final Class<T> type;

		public GenericClass(Class<T> type) {
			this.type = type;
		}

		public Class<T> getMyType() {
			return this.type;
		}
	}

	public Type getType(final Class<?> rawClass, final Class<?> parameter) {
		ParameterizedType res = new ParameterizedType() {
			@Override
			public Type[] getActualTypeArguments() {
				return new Type[] { parameter };
			}

			@Override
			public Type getRawType() {
				return rawClass;
			}

			@Override
			public Type getOwnerType() {
				return null;
			}
		};

		return res;
	}

	public class UserPassDTO {
		public String userName;
		public String password;

		public UserPassDTO(String username, String password) {
			super();
			this.userName = username;
			this.password = password;
		}
	}

	public class ResLoginDTO {
		public AuthTokenDTO authToken;
	}

	public class AuthTokenDTO {
		public String token;
	}
}
