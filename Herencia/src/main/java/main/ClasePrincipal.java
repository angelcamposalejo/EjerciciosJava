/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;
/**
 *
 * @author angelcampos
 */
public class ClasePrincipal {
    public static void main(String[] args){
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.println("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();
        
        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.restar();
        System.out.println("El resultado de la resta es: ");
        mensajeroResta.MostrarResultado();
    }
}
