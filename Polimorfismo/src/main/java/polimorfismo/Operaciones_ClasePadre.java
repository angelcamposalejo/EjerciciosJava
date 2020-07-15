/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;
import java.util.Scanner;
/**
 *
 * @author angelcampos
 */
public abstract class Operaciones_ClasePadre {
    protected int valorUno,valodDos,resultado;
    Scanner entrada = new Scanner(System.in);
    
    public void PedirDatos(){
        System.out.println("Dame el primer valor: ");
        valorUno = entrada.nextInt();
        
        System.out.println("Dame el segundo valor: ");
        valodDos = entrada.nextInt();
    }
    
    public abstract void Operaciones();
    
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
