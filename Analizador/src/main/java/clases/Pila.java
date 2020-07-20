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
public class Pila {
    private Nodo ultimoValorIngresado;
    
    public Pila(){
        ultimoValorIngresado = null;
    }
    
    //Método para insertar al final de la pila
    public void Insertar(char valor){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = valor;
        
        if (ultimoValorIngresado == null){
            nuevo_nodo.siguiente = null;
            ultimoValorIngresado = nuevo_nodo;
        }else{
            nuevo_nodo.siguiente = ultimoValorIngresado;
            ultimoValorIngresado = nuevo_nodo;
        }
    }
    
    //Método para extraer de la pila
    public char extraer(){
        if(ultimoValorIngresado != null){
            char informacion =  ultimoValorIngresado.informacion;
            ultimoValorIngresado = ultimoValorIngresado.siguiente;
            return informacion;
        }else{
            return Character.MAX_VALUE;
        }
    }
    
    //Método para saber si la pila esta vacia
    public boolean PilaVacia(){
        return ultimoValorIngresado == null;
    }
    
    
}
