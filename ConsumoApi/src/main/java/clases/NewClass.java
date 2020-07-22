/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author angelcampos
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
        getRequest();
        postRequert();
    }
    
    public static void getRequest() throws IOException{
        System.out.println("get");
        URL urlRequest = new URL("https://jsonplaceholder.typicode.com/posts/1");
        String readLine = null;
        HttpURLConnection conexion = (HttpURLConnection)urlRequest.openConnection();
        conexion.setRequestMethod("GET");
        conexion.setRequestProperty("userId", "a1bcdef");
        int responseCode = conexion.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK){
            BufferedReader in = new BufferedReader(
            new InputStreamReader(conexion.getInputStream()));
            StringBuffer response = new StringBuffer();
            while((readLine = in.readLine()) != null){
                response.append(readLine);
            }
            in.close();
            System.out.println(response.toString());
            JsonParser parser = new JsonParser();
            Object obj = parser.parse(response.toString());
            JsonObject gsonObj = (JsonObject) obj;
            System.out.println(gsonObj.get("userId").getAsInt());
            System.out.println(gsonObj.get("id").getAsInt());
            System.out.println(gsonObj.get("title").getAsString());
            System.out.println(gsonObj.get("body").getAsString());
        }
    }
    
    public static void postRequert() throws MalformedURLException, IOException{
        System.out.println("post");
        final String parametros = "{\n" + "\"userId\": 101,\r\n" +
        "    \"id\": 101,\r\n" +
        "    \"title\": \"Test Title\",\r\n" +
        "    \"body\": \"Test Body\"" + "\n}";
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("POST");
        conexion.setRequestProperty("userId", "a1bcdefgh");
        conexion.setRequestProperty("Content-Type", "application/json");
        conexion.setDoOutput(true);
        OutputStream os = conexion.getOutputStream();
        os.write(parametros.getBytes());
        os.flush();
        os.close();
        
        int responseCode = conexion.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_CREATED){
            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
            JsonParser parser = new JsonParser();
            Object obj = parser.parse(response.toString());
            JsonObject gsonObj = (JsonObject) obj;
            System.out.println(gsonObj.get("userId").getAsInt());
            System.out.println(gsonObj.get("id").getAsInt());
            System.out.println(gsonObj.get("title").getAsString());
            System.out.println(gsonObj.get("body").getAsString());
        }
        
        
    }
}
