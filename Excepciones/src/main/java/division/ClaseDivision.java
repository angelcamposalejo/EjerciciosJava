/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

import java.util.Scanner;

/**
 *
 * @author angelcampos
 */
public class ClaseDivision {

    public static void main(String[] args) {

        try {
            int valorUno, valorDos, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.println("Dame el primer valor: ");
            valorUno = entrada.nextInt();

            System.out.println("Dame el segundo valor: ");
            valorDos = entrada.nextInt();

            resultado = valorUno / valorDos;

            System.out.println("División es igual a: " + resultado);
        } catch (Exception e) {
            System.out.println("Error!!! "+e);
        }finally{
            System.out.println("Termino el programa");
        }
    }
}
