/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author angelcampos
 */
public class ClasePrincipal {
    public static void main(String[] args){
        int matriz_uno[][] = new int[2][3];
        int matriz_dos[][] = new int[3][2];
        int matriz_resultante[][] = new int[2][2];
        
        //Llenado matriz uno
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }
        
        //Llenado matriz dos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 5);
            }
        }
        
        //Multiplicacion
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos[0].length; j++) {
                int suma = 0;
                for (int k = 0; k < matriz_uno[0].length; k++) {
                    suma += matriz_uno[i][k] * matriz_dos[k][j];
                }
                matriz_resultante[i][j] = suma;
            }
        }
        
        //Imprimir matriz de multiplicacion
        for (int i = 0; i < 3; i++) {
            //Imprimir matriz uno
            for (int j = 0; j < 3; j++) {
                if(i < 2){
                    System.out.print("[ "+ matriz_uno[i][j] + " ]");
                    
                }
                else{
                    System.out.print("     ");
                }
            }
            if(i == 1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            
            //Imprimir matriz dos
            for (int j = 0; j < 3; j++) {
                if(j < 2){
                    System.out.print("[ "+ matriz_dos[i][j] + " ]");
                }
                else{
                    
                }
            }
            if (i == 1) {
                System.out.print("=");
            }else{
                System.out.print(" ");
            }
            
            //Imprimir matriz resultadnte
            for (int j = 0; j < 3; j++) {
                if (i < 2 && j < 2) {
                    System.out.print("[ "+ matriz_resultante[i][j] + " ]");
                }
            }
            
            System.out.println("");
        }
    }
}
