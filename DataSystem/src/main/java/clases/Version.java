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
public class Version {
    private String versionCompilacion = "1.0.0.1";
    private String versionProduccion;
    
    /**
     * Constructor vacio de la clase
     */
    public Version(){
        
    }
    
    /**
     * Constructor útil para cargar la versión de produccion
     * @param versionProduccion 
     */
    public Version(String versionProduccion){
        this.versionProduccion = versionProduccion;
    }
    
    /**
     * Método que permite asignar la versión de compilación
     * @param versionCompilacion Recibe el número de versión
     */
    public void setVersionCompilacion(String versionCompilacion){
        this.versionCompilacion = versionCompilacion;
    }
    
    /**
     * Método que permite obtener la versión de compilación
     * @return Devuelve la versión compilada en formato String
     */
    public String getVersionCompilacion(){
        return versionCompilacion;
    }
    
    /**
     * Método que permite asignar la versión de producción
     * @param versionProduccion Recibe el número de versión aprobada
     */
    public void setVersionProduccion(String versionProduccion){
        this.versionProduccion = versionProduccion;
    }
    
    /**
     * Método que permite obtener la versión de producción
     * @return Deveuelve la versión aprobada en formato String
     */
    public String getVersionProduccion(){
        return versionProduccion;
    }
}
