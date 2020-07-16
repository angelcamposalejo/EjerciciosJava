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
public class ClasePrincipal {
    public static void main(String[] args){
        SinConstructor mensajeroSin = new SinConstructor();
        mensajeroSin.PedirNombre();
        mensajeroSin.Imprmir();
        
        ConConstructor mensajeroCon = new ConConstructor();
        
    }
}
