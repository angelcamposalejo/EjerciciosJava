/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author angelcampos
 */
public class Recursividad {
    public int Factorial(int parametro){
        if(parametro > 0){
            int valor_calculado = parametro * Factorial(parametro - 1);
            return valor_calculado;
        }
        return 1;
    }
}
