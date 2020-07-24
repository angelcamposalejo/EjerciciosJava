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
    public ValidacionBL() {

    }

    /**
     * Método que instancia la clase
     *
     * @return Devuelve un objeto de la clase
     */
    public static ValidacionBL getInstance() {
        if (validacionBL == null) {
            validacionBL = new ValidacionBL();
        }
        return validacionBL;
    }

    /**
     * Método que capitaliza una cadena
     *
     * @param cadenaEvaluar Recibe la cadena que se capizalizará
     * @return Devuelve la cadena capitalizada
     */
    public String capitalizarCadena(String cadenaEvaluar) {
        if (validarCadenaVacia(cadenaEvaluar)) {
            cadenaEvaluar = cadenaEvaluar.toLowerCase();
            String[] palabras = cadenaEvaluar.split(" ");
            String cadenaCapitalizada = "";
            for (int i = 0; i < palabras.length; i++) {
                if (i > 0) {
                    cadenaCapitalizada += " ";
                }
                String resultado = palabras[i].toUpperCase().charAt(0) + palabras[i].substring(1, palabras[i].length()).toLowerCase();
                cadenaCapitalizada += resultado;
                palabras[i] = resultado;
            }
            return cadenaCapitalizada;
        } else {
            return "";
        }
    }
    
    /**
     * Método que evita se tecleen espacios dobles y al inicio de una cadena
     * @param cadenaEvaluar Recibe la cadena averificar
     * @param evt Recibe la tecla presionanda por el usuario
     */
    public void validarDobleEspacio(String cadenaEvaluar,java.awt.event.KeyEvent evt){
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            if(validarCadenaVacia(cadenaEvaluar)){
                char ultimaLetra =cadenaEvaluar.charAt(cadenaEvaluar.length() - 1);
                if (ultimaLetra == ' ') {
                    evt.consume();
                }
            }else{
                evt.consume();
            }
        }
    }
    
    /**
     * Método que verifica si una cadena esta vacia
     *
     * @param cadenaEvaluar Recibe la cadena a evaluar
     * @return Devuevle el resultado de la verificación
     */
    public boolean validarCadenaVacia(String cadenaEvaluar) {
        if (cadenaEvaluar != null && !cadenaEvaluar.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que evita sean ingresados espacios en una cadena
     *
     * @param evt Recibe la tecla presioanda por el usuario
     */
    public void validarSinEspacio(java.awt.event.KeyEvent evt) {
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }
    
    /**
     * Método qu evita sean ingresados carácteres diferentes a digitos
     * @param evt 
     */
    public void validarSoloNumeros(java.awt.event.KeyEvent evt){
        char caracterIntroducido = evt.getKeyChar();
        if (!(Character.isDigit(caracterIntroducido)
                || (caracterIntroducido == KeyEvent.VK_BACK_SPACE)
                || (caracterIntroducido == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }
}
