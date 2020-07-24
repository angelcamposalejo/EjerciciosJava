/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import java.awt.event.KeyEvent;

/**
 *
 * @author angelcampos
 */
public class ValidacionBL {
    /**
     * Variable que permite instanciar la clase
     */
    private static ValidacionBL validacionBL;
    
    /**
     * Constructor vacio de la clase
     */
    public ValidacionBL(){
        
    }
    
    /**
     * Método que instancia la clase
     * @return Devuelve un objeto de la clase
     */
    public static ValidacionBL getInstance(){
        if(validacionBL == null)
            validacionBL = new ValidacionBL();
        return validacionBL;
    }
    
    /**
     * Método que evita sean ingresados espacios en una cadena
     * @param evt Recibe la tecla presioanda por el usuario
     */
    public void validarSinEspacio(java.awt.event.KeyEvent evt){
        if(evt.getKeyChar() == KeyEvent.VK_SPACE){
            evt.consume();
        }
    }
}
