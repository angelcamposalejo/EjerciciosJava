/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author angelcampos
 */
public class Conversiones {
    public static void main(String[] args){
        double anguloGrados = 45;
        
        double anguloRadianes = Math.toRadians(anguloGrados);
        System.out.println("Deg a Rad "+ anguloGrados + "' = "+ anguloRadianes +" rad");
        
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Rad a Deg "+ anguloRadianes + " rad = "+ anguloGrados +" '");
    }
}
