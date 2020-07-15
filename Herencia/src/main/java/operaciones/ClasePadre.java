/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;
import java.util.Scanner;
/**
 *
 * @author angelcampos
 */
public class ClasePadre {
    protected int valorUno,valorDos,resultado;    
    Scanner entrada = new Scanner(System.in);
    
    //Este método pide los valores al usuario
    public void PedirDatos(){
        System.out.println("Dame el primer valor: ");
        valorUno = entrada.nextInt();
        
        System.out.println("Dame el segundo valor: ");
        valorDos = entrada.nextInt();
    }
    
    //Este método muestra el resultado
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
