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
public class HiloDos extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.print("E");
            
            try{
                HiloDos.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en la clase HiloDos "+e);
            }
        }
    }
}
