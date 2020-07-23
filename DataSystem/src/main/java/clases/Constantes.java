/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author angelcampos
 */
public class Constantes {
    /**
     * Variable que permite instanciar la clase
     */
    private static Constantes constantes;
    
    /**
     * Cosntructor vacio de la clase
     */
    private Constantes(){
        
    }
    
    /**
     * Variable que contiene la ruta raiz del servicio
     */
    private String url="http://3.133.42.51:16001/ingetel";
    
    /**
     * Variable que contiene la versión de software
     */
    private String version="1.0.0.1";
    
    /**
     * Método que instancia la clase
     * @return Devuevle un objeto de la clase
     */
    public static Constantes getInstance(){
        if(constantes == null)
            constantes = new Constantes();
        return constantes;
    }
    
    /**
     * Método que permite obtener la API para listar los permisos activos
     * @return Devuelve la ruta de la api
     */
    public String listarPermiso(){
        return url+"/usuario/listarPermiso";
    }
}
