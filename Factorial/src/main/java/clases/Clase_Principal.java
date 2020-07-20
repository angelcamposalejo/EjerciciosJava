/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.Scanner;
/**
 *
 * @author angelcampos
 */
public class Clase_Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número para calcular su factorial");
        int numero = entrada.nextInt();
        Recursividad resursividad = new Recursividad();
        
        int factorial = resursividad.Factorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
        
    }
}
