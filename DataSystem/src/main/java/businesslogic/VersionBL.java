/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import clases.Version;
import dataaccess.VersionDAO;

/**
 *
 * @author angelcampos
 */
public class VersionBL {
    /**
     * Variable que permite instanciar la clase
     */
    private static VersionBL versionBL;
    
    /**
     * Constructor vacio de la clase
     */
    public VersionBL(){
        
    }
    
    /**
     * Método que instancia la clase
     * @return Devuelve un objeto de la clase
     */
    public static VersionBL getInstance(){
        if(versionBL == null)
            versionBL = new VersionBL();
        return versionBL;
    }
    
    /**
     * Método que verifica si se esta compilando la ultima versión aprobada
     * @return Devuevle el resultado de la verificacion
     */
    public String validarVersion(){
        String jsonIdentificador = "{"
                + "\"identificador\":\"ingecel\"}";
        Version version = new Version();
        version.setVersionProduccion(VersionDAO.getInstance().read(jsonIdentificador));

        if(version.getVersionCompilacion() != version.getVersionProduccion()){
            return version.getVersionProduccion();
        }else{
            return "0";
        }
    }
}
