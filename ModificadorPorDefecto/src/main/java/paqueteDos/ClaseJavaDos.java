/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;

import paqueteUno.Atributo_Metodos;

/**
 *
 * @author angelcampos
 */
public class ClaseJavaDos {
    public static void main(String[] args){
        Atributo_Metodos mensajero = new Atributo_Metodos();
        //No puedes acceder a las variable porque la clase pertence al mismo paquete
        //mensajero.valorDos;
    }
}
