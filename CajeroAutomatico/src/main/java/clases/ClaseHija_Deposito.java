/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author javierserranolule
 */
public class ClaseHija_Deposito extends ClasePadre_Abstracta{
    
    @Override
    public void Transacciones(){
        Depositar();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("-------------------------------");
        System.out.println("Depositaste: "+ deposito);
        System.out.println("Tu saldo actual es: "+ getSaldo());
        System.out.println("-------------------------------");
    }
}
