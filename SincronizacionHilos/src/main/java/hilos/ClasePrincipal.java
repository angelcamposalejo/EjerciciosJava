/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author angelcampos
 */
public class ClasePrincipal {
    public static void main(String[] args){
        HiloUno hiloUno = new HiloUno();
        HiloDos hiloDos = new HiloDos();
        HiloTres hiloTres = new HiloTres();
        HiloCuatro hiloCuatro = new HiloCuatro();
        
        hiloUno.start();
        try{
            hiloUno.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo uno "+e);
        }
        
        hiloDos.start();
        try{
            hiloDos.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo dos "+e);
        }
        
        hiloTres.start();
        try{
            hiloTres.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo tres "+e);
        }
        
        hiloCuatro.start();
        try{
            hiloCuatro.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo cuatro "+e);
        }
    }
}
