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
    private static PermisoAdministradorBL permisoAdministradorBL;
    
    public PermisoAdministradorBL(){
        
    }
    
    public static PermisoAdministradorBL getInstance(){
        if(permisoAdministradorBL == null)
            permisoAdministradorBL = new PermisoAdministradorBL();
        return permisoAdministradorBL;
    }
    
    public ArrayList<PermisoAdministrador> listarUsuario(int estado){
        return PermisoAdministradorDAO.getInstance().list(estado);
    }
}
