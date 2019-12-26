package com.stacktest.nextlab.tests;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
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
import java.util.HashMap;
import java.util.List;

import org.slf4j.LoggerFactory;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class RestConnection {
	// private String urlHost = "http://localhost:8080/saludServer";
	// private String urlHost = "http://64.215.200.200:8080/saludServerNextLab";
	private String urlHost = "http://64.215.200.200:8092/saludServer";
	// private String urlHost = "http://64.215.200.237:8080/saludServer";

	private String codificacion = "UTF-8";
	private HashMap<String, String> parametros;
	private String jsonResponse;
	private String method;
	private String mjePost;
	private GsonBuilder gBuilder;

	public RestConnection() {
		parametros = new HashMap<>();
		gBuilder = new GsonBuilder().setDateFormat("dd-MM-yyyy HH:mm:ss");
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

	public void setGsonBuilder(GsonBuilder builder) {
		gBuilder = builder;
	}

	public <T> T ejecutar(String method, String urlPart, Class<T> type) {
		this.method = method;
		String url = urlHost + urlPart;
		T res = null;
		HttpURLConnection conn = null;

		try {
			// Genero los datos de conexión
			conn = crearConexion(url);
			conn.connect();

			// Obtengo la respuesta
			InputStream in = new BufferedInputStream(conn.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, codificacion));

			res = deserealizarRespuesta(type, reader);
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

					if (conn.getResponseCode() == 400)
						res = deserealizarRespuesta(type, reader);
					else {
						String linea;
						while ((linea = reader.readLine()) != null)
							LoggerFactory.getLogger(this.getClass()).debug(linea);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				assert false;
			}
		}

		return res;
	}

	private <T> T deserealizarRespuesta(Class<T> type, BufferedReader reader) throws IOException {
		T res;
		// Uno y deserealizo la respuesta separada or líneas
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

		// Seteo los tiempos de conexi�n y la abro
		res.setConnectTimeout(30 * 1000);
		res.setReadTimeout(60 * 1000);
		res.setDoOutput(true);
		res.setRequestMethod(method);

		// Si hay mensaje post se lo agrego
		if (mjePost != null) {
			DataOutputStream wr = new DataOutputStream(res.getOutputStream());
			wr.write(mjePost.getBytes(codificacion));
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
}
