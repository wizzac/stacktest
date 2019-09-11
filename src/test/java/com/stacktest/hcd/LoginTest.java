package com.stacktest.hcd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class LoginTest {
	public String host = "http://192.168.0.104:8080";
	public String token;
	
	@Test
	public void doLogin() {
		try {
			URL obj = new URL(host + "/saludServer/token/login/temporal");
			 
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			con.setConnectTimeout(20 * 1000);
			con.setReadTimeout(10 * 1000);
			con.setDoOutput(true);

			//add reuqest header
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/plain, */*");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("X-Requested-With", "XMLHttpRequest");

			String postMessage = "{\"userName\":\"1M\",\"password\":\"1234\"}";
			
			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(postMessage);
			wr.flush();
			wr.close();
			
			 // Obtengo la respuesta
            InputStream in = new BufferedInputStream(con.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));

            // Uno y deserealizo la respuesta separada or íneas
            List<String> lineas = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null)
                lineas.add(linea);

            String strRes = "";
            for (int i = 0; i < lineas.size(); i++) {
                strRes += lineas.get(i);
                if (i < lineas.size() - 1)
                    strRes += System.getProperty("line.separator");
            }
            
            LoginDTO[] dtos = new Gson().fromJson(strRes, LoginDTO[].class);
            token = dtos[0].authToken.token;           
            
			in.close();
			
			assert true;
		} catch (ConnectException ce) {
			ce.printStackTrace();
			assert false;
        }  catch (SocketTimeoutException ste) {
			ste.printStackTrace();
			assert false;
        } catch (UnknownHostException ste) {
			ste.printStackTrace();
			assert false;
        } catch (JsonSyntaxException jse) {
			jse.printStackTrace();
			assert false;
        } catch (UnsupportedEncodingException uee) {
			uee.printStackTrace();
			assert false;
        } catch (MalformedURLException e) {
			e.printStackTrace();
			assert false;
		} catch (ProtocolException e) {
			e.printStackTrace();
			assert false;
		} catch (IOException e) {
			e.printStackTrace();
			assert false;
		} catch (Exception e) {
			e.printStackTrace();
			assert false;
        } 
	}
	
	public class LoginDTO{
		public AuthTokenDTO authToken;
	}
	
	public class AuthTokenDTO{
		public String token;
	}
}
