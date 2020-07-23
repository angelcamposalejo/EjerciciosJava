/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import clases.Permiso;
import dataaccess.PermisoDAO;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author angelcampos
 */
public class PermisoBL {
    /**
     * Variable que permite instanciar la clase
     */
    private static PermisoBL permisoBL;
    
    /**
     * Constructor vacio de la clase
     */
    public PermisoBL(){
        
    }
    
    /**
     * Método que instancia la clase
     * @return Devuelve un objeto de la clase
     */
    public static PermisoBL getInstance(){
        if(permisoBL == null)
            permisoBL = new PermisoBL();
        return permisoBL;
    }
    
    /**
     * Método que muestra los permisos activos en un ComboBox
     * @param comboPermiso Recibe el ComboBox que contendrá la información
     */
    public void listarPermiso(JComboBox comboPermiso){
        comboPermiso.removeAllItems();
        ArrayList<Permiso> permisoList = PermisoDAO.getInstance().getPermiso();
        for (Permiso permiso : permisoList) {
            comboPermiso.addItem(permiso);
        }
    }
    
}
