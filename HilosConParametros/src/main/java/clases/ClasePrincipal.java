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
public class ClasePrincipal {
    public static void main(String[] args){
        Proceso hiloUno = new Proceso(" HiloUno");
        Proceso hiloDos = new Proceso(" HiloDos");
        Proceso hiloTres = new Proceso(" HiloTres");
        
        hiloUno.ValorDeLaCondicion(5);
        hiloDos.ValorDeLaCondicion(10);
        hiloTres.ValorDeLaCondicion(5);
        
        hiloUno.start();
        hiloDos.start();
        hiloTres.start();
    }
}
