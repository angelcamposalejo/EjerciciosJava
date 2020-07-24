/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import clases.PermisoAdministrador;
import dataaccess.PermisoAdministradorDAO;
import java.util.ArrayList;

/**
 *
 * @author angelcampos
 */
public class PermisoAdministradorBL {
    /**
     * Variable que permite instanciar la clase
     */
    private static PermisoAdministradorBL permisoAdministradorBL;
    
    /**
     * Constructor vacio de la clase
     */
    public PermisoAdministradorBL(){
        
    }
    
    /**
     * Método que instancia la clase
     * @return Devuelve un objeto de la clase
     */
    public static PermisoAdministradorBL getInstance(){
        if(permisoAdministradorBL == null)
            permisoAdministradorBL = new PermisoAdministradorBL();
        return permisoAdministradorBL;
    }
    
    /**
     * Método que devuelve la lista de usuario
     * @param estado Recibe el estado que se requiere mostrar
     * @return Devuelve una lista de la clase PermisoAdministrador
     */
    public ArrayList<PermisoAdministrador> listarUsuario(int estado){
        try{
            return PermisoAdministradorDAO.getInstance().list(estado);
        }catch(Exception e){
            return new ArrayList<>();
        }
    }
}
