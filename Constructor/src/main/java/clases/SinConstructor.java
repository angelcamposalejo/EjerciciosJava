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
public class SinConstructor {
    private Scanner entrada = new Scanner(System.in);
    String nombre = "";
    
    public void PedirNombre(){
        System.out.println("¿Cuál es tu nombre?:");
        nombre = entrada.nextLine();
    }
    
    public void Imprmir(){
        System.out.println("Tu nombre es: "+nombre);
    }
}
