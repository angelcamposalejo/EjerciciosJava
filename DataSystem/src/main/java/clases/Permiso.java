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
public class Permiso {
    //Declaración de variables
    private int id;
    private String tipo;
    
    /**
     * Constructor vacio
     */
    public Permiso(){
        
    }
    
    /**
     * Constructor útil para referenciar
     * @param id Recibe el identificador único del permiso
     */
    public Permiso(int id){
        this.id = id;
    }
    
    /**
     * Constructor útil para mostrar el nivel de permiso
     * @param tipo Recibe el nombre del permiso
     */
    public Permiso(String tipo){
        this.tipo = tipo;
    }
    
    /**
     * Constructor útil para listar
     * @param id Recibe el identificador único del permiso
     * @param tipo Recibe el nombre del permiso
     */
    public Permiso(int id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }
    
    /**
     * Método que permite asignar el identificador del permiso
     * @param id Recibe el identificador asignado
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * Método que permite obtener el identificador del permiso
     * @return Devuevle el identificador asignado en formato int
     */
    public int getId(){
        return id;
    }
    
    /**
     * Método que permite asignar el nombre del permiso
     * @param tipo Recibe el nombre asignado
     */
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    /**
     * Método que permite obtener el nombre del permiso
     * @return Devuelve el nombre asignado en formato String
     */
    public String getTipo(){
        return tipo;
    }
    
    /**
     * Método útil para definir el elemento que se desea mostrar al referenciar el objeto
     * @return Devuelve el nombre del permiso
     */
    @Override
    public String toString() {
        return tipo;
    }
}
