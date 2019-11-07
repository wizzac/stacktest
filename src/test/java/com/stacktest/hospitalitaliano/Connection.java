package com.stacktest.hospitalitaliano;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class Connection {
	private String urlHost = "https://www.hospitalitaliano.org.ar/Hiba-RestApiTest";
	private String identificacion = "50261000999133";
	private String usuario = "";

	private String codificacion = "UTF-8";
	private String jsonResponse;
	private String method = "POST";
	private String mjePost;
	private GsonBuilder gBuilder;
	private String token;

	public Connection() {
		gBuilder = new GsonBuilder();
		autentificar(identificacion, usuario);
	}

	public <T> T ejecutar(String urlPart, Class<T> type) {
		T res = null;
		HttpURLConnection conn = null;

		try {
			// Genero los datos de conexión
			conn = crearConexion(urlHost + urlPart);
			conn.connect();

			// Obtengo la respuesta
			InputStream in = new BufferedInputStream(conn.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, codificacion));

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

	private void autentificar(String institucion, String usuario) {
		AutentificacionDto autDto = new AutentificacionDto();
		autDto.setInstitucion(institucion);
		autDto.setUsuario(usuario);
		
		mjePost = gBuilder.create().toJson(autDto);
		token = ejecutar("/v1/sesion", String.class);
		mjePost = null;
	}

	private HttpURLConnection crearConexion(String url) throws Exception {
		// Creo la conexión
		HttpURLConnection res = (HttpURLConnection) new URL(url).openConnection();

		// Agrego las cabeceras
		res.setRequestProperty("Accept-Charset", codificacion);
		res.setRequestProperty("Content-type", "application/json");
		res.setRequestProperty("Accept", "application/json, text/plain, */*");

		if (token != null)
			res.setRequestProperty("Authorization", "Bearer " + token);

		// Seteo los tiempos de conexión y la abro
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

	public void setMensajePost(String mensaje) {
		mjePost = mensaje;
	}

	public void setMensajePost(Object jsonElement) {
		mjePost = gBuilder.create().toJson(jsonElement);
	}

	public GsonBuilder getGsonBuilder() {
		return gBuilder;
	}

	public void setGsonBuilder(GsonBuilder builder) {
		gBuilder = builder;
	}
}
