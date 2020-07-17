/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_tipo_pila;

import javax.swing.JOptionPane;

/**
 *
 * @author angelcampos
 */
public class Pila {
    private Nodo ultimoValorIngresado;
    int tamano = 0;
    String lista = "";
    
    public Pila(){
        ultimoValorIngresado = null;
        tamano = 0;
    }
    
    //saber si la pila esta vacia
    public boolean PilaVacia(){
        return ultimoValorIngresado == null;
    }
    
    //Insertar un nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevo_nodo;
        tamano++;
    }
    
    //Eliminar nodo de la lista
    public int EliminarNodo(){
        int auxiliar = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    //conocer el ultimo valor ingresado
    public int MostrarultimoValorIngresado(){
        return ultimoValorIngresado.informacion;
    }
    
    //Conocer el tamaño de la pila
    public int TamanoPila(){
        return tamano;
    }
    
    //Vaciar la pila
    public void VaciarPila(){
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }
    
    //Mostrar contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = ultimoValorIngresado;
        
        while(recorrido != null){
            lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
}
