package com.stacktest.hcd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class HCDConnection {	
	//private String host = "http://localhost:8080/saludServer";
	private String host = "http://192.168.0.104:8080/saludServer";

	private String codificacion = "UTF-8";
	private HashMap<String, String> parametros;
	private String method;
	private String mjePost;
	private GsonBuilder gBuilder;
	private String token;

	public HCDConnection(String username, String password) {
		parametros = new HashMap<>();
		gBuilder = new GsonBuilder();

		UserPassDTO upDto = new UserPassDTO(username, password);
		mjePost = gBuilder.create().toJson(upDto);
		ResLoginDTO[] dto = ejecutar("GET", "/token/login/temporal", ResLoginDTO[].class);
		token = dto[0].authToken.token;
		mjePost = null;
	}

	public void setMensajePost(String mensaje) {
		mjePost = mensaje;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void agregarParametroGet(String clave, String valor) {
		parametros.put(clave, valor);
	}

	public GsonBuilder getGsonBuilder() {
		return gBuilder;
	}

	public <T> T ejecutar(String method, String urlPart, Class<T> type) {
		this.method = method;
		String url = host + urlPart;
		T res = null;
		String json = "";

		try {
			// Genero los datos de conexi�n
			HttpURLConnection conn = crearConexion(url);
			conn.connect();

			// Obtengo la respuesta
			InputStream in = new BufferedInputStream(conn.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, codificacion));

			// Uno y deserealizo la respuesta separada or �neas
			List<String> lineas = new ArrayList<>();
			String linea;
			while ((linea = reader.readLine()) != null)
				lineas.add(linea);

			for (int i = 0; i < lineas.size(); i++) {
				json += lineas.get(i);
				if (i < lineas.size() - 1)
					json += System.getProperty("line.separator");
			}

			res = gBuilder.create().fromJson(json, type);
		} catch (ConnectException e) {
			e.printStackTrace();
			assert false;
		} catch (SocketTimeoutException e) {
			e.printStackTrace();
			assert false;
		} catch (UnknownHostException e) {
			e.printStackTrace();
			assert false;
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
			assert false;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			assert false;
		} catch (Exception e) {
			e.printStackTrace();
			assert false;
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
