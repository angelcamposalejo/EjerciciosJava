/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import clases.Constantes;
import clases.Permiso;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author angelcampos
 */
public class PermisoDAO {

    /**
     * Variable que permite instanciar la clase
     */
    private static PermisoDAO permisoDAO;
    
    /**
     * Constructor vacio de la clase
     */
    public PermisoDAO() {

    }
    
    /**
     * Método que instancia la clase
     * @return Devuelve un objeto de la clase
     */
    public static PermisoDAO getInstance() {
        if (permisoDAO == null) {
            permisoDAO = new PermisoDAO();
        }
        return permisoDAO;
    }
    
    /**
     * Método que obtiene los permisos activos
     * @return Devuelve los permisos activos en una lista de la clase Permiso
     */
    public ArrayList<Permiso> getPermiso() {
        ArrayList<Permiso> permisoList = new ArrayList<>();
        try {
            URL urlRequest = new URL(Constantes.getInstance().listarPermiso());
            String readLine = null;
            HttpURLConnection conexion = (HttpURLConnection) urlRequest.openConnection();
            conexion.setRequestMethod("GET");
            int responseCode = conexion.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(conexion.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                }
                in.close();
                
                JsonParser parser = new JsonParser();
                JsonArray jsonArray = parser.parse(response.toString()).getAsJsonArray();

                for ( JsonElement obj : jsonArray) {
                    JsonObject jsonObj = obj.getAsJsonObject();
                    int id = jsonObj.get("id").getAsInt();
                    String tipo = jsonObj.get("tipo").getAsString();
                    Permiso permiso = new Permiso(id,tipo);
                    permisoList.add(permiso);
                }
                return permisoList;
            } else {
                return permisoList;
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e);
            return permisoList;
        }
    }
}
