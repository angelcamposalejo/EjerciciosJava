/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_tipo_pila;

/**
 *
 * @author angelcampos
 */
public class Nodo {
    int informacion;
    Nodo siguiente;
    
    public Nodo(int valor){
        this.informacion = valor;
        siguiente = null;
    }
}
