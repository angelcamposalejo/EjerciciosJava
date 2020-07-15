/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.morpheusdss.inversordepalabras;

import java.util.Scanner;

/**
 *
 * @author angelcampos
 * @version 1.0.0.1
 */
public class inversordepalabras {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra = "", palabraInvertida = "";
        int loguitudPalabra = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una palabra o una frase: ");
        palabra = entrada.nextLine();

        loguitudPalabra = palabra.length();

        while (loguitudPalabra != 0) {
            palabraInvertida += palabra.substring(loguitudPalabra -1,loguitudPalabra);
            loguitudPalabra--;
        }
        System.out.print("Palabra invertida: "+ palabraInvertida);
        System.out.println("");
    }
}
