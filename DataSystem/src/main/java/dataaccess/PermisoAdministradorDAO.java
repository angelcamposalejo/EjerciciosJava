/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import clases.Administrador;
import clases.Constantes;
import clases.Permiso;
import clases.PermisoAdministrador;
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
public class PermisoAdministradorDAO {
    /**
     * Variable que permite instanciar la clase
     */
    private static PermisoAdministradorDAO permisoAdministradorDAO;
    
    /**
     * Constructor vacio de la clase
     */
    public PermisoAdministradorDAO(){
        
    }
    
    /**
     * Método que instancia la clase
     * @return Devuelve un objeto de la clase
     */
    public static PermisoAdministradorDAO getInstance(){
        if(permisoAdministradorDAO == null)
            permisoAdministradorDAO = new PermisoAdministradorDAO();
        return permisoAdministradorDAO;
    }
    
    /**
     * Método que obtiene los usuario de la BD
     * @param estado Recibe el estado de los usuarios que se desea mostrar
     * @return Devuelve una lista de la clase PermisoAdministrador
     */
    public ArrayList<PermisoAdministrador> list(int estado){
        ArrayList<PermisoAdministrador> usuarioList = new ArrayList<>();
        try{
            URL urlRequest = new URL(Constantes.getInstance().listarUsuario());
            String readLine = null;
            HttpURLConnection conexion = (HttpURLConnection) urlRequest.openConnection();
            conexion.setRequestMethod("GET");
            int responseCode = conexion.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK){
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(conexion.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                }
                in.close();
                
                JsonParser parser = new JsonParser();
                JsonArray jsonArray = parser.parse(response.toString()).getAsJsonArray();
                
                for ( JsonElement obj : jsonArray){
                    JsonObject jsonObj = obj.getAsJsonObject();
                    int id = jsonObj.get("id").getAsInt();
                    String nickname = jsonObj.get("nickname").getAsString();
                    String pass = jsonObj.get("pass").getAsString();
                    int activo = jsonObj.get("activo").getAsInt();
                    int permiso_id = jsonObj.get("permiso_id").getAsInt();
                    String nombre = jsonObj.get("nombre").getAsString();
                    int administrador_id = jsonObj.get("administrador_id").getAsInt();
                    String tipo = jsonObj.get("tipo").getAsString();
                    Permiso permiso = new Permiso(permiso_id,
                            tipo);
                    Administrador administrador = new Administrador(administrador_id,
                            nombre);
                    PermisoAdministrador permisoAdministrador = new PermisoAdministrador(id, 
                            nickname, 
                            pass, 
                            activo, 
                            administrador, 
                            permiso);
                    if(activo == estado){
                        usuarioList.add(permisoAdministrador);
                    }
                    System.out.println(obj);
                }
                return usuarioList;
            }else{
                return usuarioList;
            }
        }catch(IOException e){
            return usuarioList;
        }
    }
}
