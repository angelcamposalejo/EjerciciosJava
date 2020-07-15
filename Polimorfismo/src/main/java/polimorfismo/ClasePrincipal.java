/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author angelcampos
 */
public class ClasePrincipal {
    public static void main(String[] args){
        Operaciones_ClasePadre mensajero_suma = new Suma_ClaseHija();
        mensajero_suma.PedirDatos();
        System.out.println("El resultado de la suma es: ");
        mensajero_suma.Operaciones();
        mensajero_suma.MostrarResultado();
        
        Operaciones_ClasePadre mensajero_resta = new Resta_ClaseHija();
        mensajero_resta.PedirDatos();
        System.out.println("El resultado de la resta es:");
        mensajero_resta.Operaciones();
        mensajero_resta.MostrarResultado();
        
    }
}
