/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import clases.Constantes;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author angelcampos
 */
public class VersionDAO {
    /**
     * Variable que permite instanciar la clase
     */
    private static VersionDAO versionDAO;
    
    /**
     * Constructor vacio de la clase
     */
    public VersionDAO() {

    }
    
    /**
     * Método que instancia la clase
     * @return Devuelve un objeto de la clase
     */
    public static VersionDAO getInstance() {
        if (versionDAO == null) {
            versionDAO = new VersionDAO();
        }
        return versionDAO;
    }
    
    /**
     * Método que obtiene el número de versión aprobada
     * @param json Recibe el identificador del producto a buscar
     * @return Devuele la versión obtenida en formato String
     */
    public String read(String json) {
        try {
            URL urlRequest = new URL(Constantes.getInstance().obtenerVersiones()
                    + "?param=" + json);
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
                Object obj = parser.parse(response.toString());
                JsonObject jsonObj = (JsonObject) obj;
                if(jsonObj.get("response").getAsInt() == 1){
                    return "1";
                }
                else{
                    return "0";
                }
            }else{
                return "0";
            }
        } catch (IOException e) {
            return "0";
        }
    }
}
