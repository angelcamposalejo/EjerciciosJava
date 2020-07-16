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
public class FuncionesTrigonometricos {
    public static void main(String[] args){
        double resultado = 0;
        double anguloGrados = 45;
        double anguloRadianes = Math.toRadians(anguloGrados);
        
        //Calcular el seno
        resultado = Math.sin(anguloRadianes);
        System.out.println("Seno de "+ anguloGrados + "' = "+ resultado);
        
        //Calcular el coseno
        resultado = Math.cos(anguloRadianes);
        System.out.println("Coseno de "+ anguloGrados + "' = "+ resultado);
        
        //Calcular la tangente
        resultado = Math.tan(anguloRadianes);
        System.out.println("Tangente de "+ anguloGrados + "' = "+ resultado);
    
        double valorIngresado = 0.707;
        
        //Calcular el arco coseno
        anguloRadianes = Math.asin(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco coseno de: "+ valorIngresado+" = "+ anguloGrados+"'");
        
        //Calcular el arco seno
        anguloRadianes = Math.acos(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco seno de: "+ valorIngresado+" = "+ anguloGrados+"'");
        
        //Calcular el arco tangente
        anguloRadianes = Math.atan(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco tangente de: "+ valorIngresado+" = "+ anguloGrados+"'");
    }
}
