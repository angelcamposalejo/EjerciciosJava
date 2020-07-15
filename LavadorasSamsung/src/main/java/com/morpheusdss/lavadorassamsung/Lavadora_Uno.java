
package com.morpheusdss.lavadorassamsung;
import Libreria.LLFunciones;
import java.util.Scanner;
/**
 * Ejercicio POO(implementación de polimorfismo)
 * @author angelcampos
 */
public class Lavadora_Uno {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - Ropa Blanca / 2 - Ropa Color");
        int tipoDeRopa = entrada.nextInt();
        
        System.out.println("¿Cúantos kilos de ropa?");
        int kilos = entrada.nextInt();
        
        LLFunciones mensajero = new LLFunciones(kilos,tipoDeRopa);
        mensajero.setTipoRopa(2);
        System.out.println("El tipo de ropa es: "+mensajero.getTipoRopa());
        mensajero.CicloFinalizado();
    }
}
