/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author angelcampos
 */
public class Cola {
    private Nodo inicioCola,finalCola;
    String cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    //Método para saber si la cola esta vacia
    public boolean ColaVacia(){
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Método para insertar a la cola
    public void Insertar(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;
        
        if (ColaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }
    
    //Método para extraer de la cola
    public int Extraer(){
        if (!ColaVacia()) {
             int informacion = inicioCola.informacion;
             
             if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                 inicioCola = inicioCola.siguiente;
            }
            return informacion; 
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Método para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String colaInvertida = "";
        
        while(recorrido != null){
            cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = cola.split(" ");
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            colaInvertida += " "+cadena[i];
        }
        
        JOptionPane.showMessageDialog(null, colaInvertida);
        cola = "";
    }
}
