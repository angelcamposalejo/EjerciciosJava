package com.morpheusdss.suma;
import java.util.Scanner;



/**
 *
 * @author angelcampos
 */
public class SumaMain {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame le primer valor: ");
        int valorUno = entrada.nextInt();
        
        System.out.println("Dame le segundo valor: ");
        int valorDos = entrada.nextInt();
        
        Suma valores = new Suma(valorUno,valorDos);
        valores.Imprimir();
    }
}
