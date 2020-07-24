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
     * Método que permite acceder al sistema
     * @param permisoAdministrador Recibe el usuario que desea acceder al sistema
     * @return Devuelve si se permitirá ingresar
     */
    public boolean ingresar(PermisoAdministrador permisoAdministrador){
        if (validarCamposLogin(permisoAdministrador.getNickname(), permisoAdministrador.getPass())) {
            if (PermisoAdministradorDAO.getInstance().read(permisoAdministrador) >0) {
                System.out.println("Acceso correcto");
                return true;
            }else{
                System.out.println("Favor de verificar sus credenciales");
                return false;
            }
        } else {
            return false;
        }
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
    
    /**
     * Método para validar que los campos para accesar sean corresctos
     * @param nick Recibe el nick proporcionado por el usuario
     * @param pass Recibe el password proporcionado por el usuario
     * @return Devuelve el resultado de la validación
     */
    private boolean validarCamposLogin(String nick, String pass){
        if (ValidacionBL.getInstance().validarCadenaVacia(nick)) {
            if (ValidacionBL.getInstance().validarCadenaVacia(pass)) {
                return true;
            }else{
                System.out.println("Pass vacio");
                return false;
            }
        }else{
            System.out.println("Nick vacio");
            return false;
        }
    }
}
