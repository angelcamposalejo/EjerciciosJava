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
        ProcesoUno hiloUno = new ProcesoUno();
        ProcesoUno hiloTres = new ProcesoUno();
        Thread hiloDos = new Thread(new ProcesoDos());
        hiloUno.start();
        hiloDos.start();
        hiloTres.start();
    }
}
