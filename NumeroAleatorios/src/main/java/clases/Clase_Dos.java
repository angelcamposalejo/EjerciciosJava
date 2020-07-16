/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.Random;
/**
 *
 * @author angelcampos
 */
public class Clase_Dos {
    public static void main(String[] args){
        int aleatorio = 0;
        
        Random r = new Random();
        
        aleatorio = (int)(r.nextDouble() * 100);
        System.out.println(aleatorio);
    }
}
