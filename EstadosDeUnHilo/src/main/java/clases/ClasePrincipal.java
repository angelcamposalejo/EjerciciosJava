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

    public static void main(String[] args) {
        //1 - Estado de creación
        Hilo_Proceso hiloUno = new Hilo_Proceso();
        Hilo_Proceso hiloDos = new Hilo_Proceso();

        //2 - Estado runneable
        hiloUno.start();

        try {
            //3 - Bloqueado o no runneable
            hiloUno.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hiloUno: "+e);
        }

        hiloDos.start();
        
        // 4 - Muerte de un hilo
        hiloDos.stop();
        
        try{
            hiloDos.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hiloDos: "+e);
        }
    }
}
