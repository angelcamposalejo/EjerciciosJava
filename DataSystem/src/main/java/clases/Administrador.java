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
public class Administrador {
    /**
     * Declaración de variables
     */
    private int id;
    private String nombre;
    
    /**
     * Constructor vacio de la clase
     */
    public Administrador(){
        
    }
    
    /**
     * Constructor útil para hacer referencia a la clase
     * @param id Recibe el identificador unico de la clase
     */
    public Administrador(int id){
        this.id = id;
    }
    
    /**
     * Constructor útil para registrar un usuario
     * @param nombre Recibe el nombre del usuario
     */
    public Administrador(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Constructor útil para mostrar información
     * @param id Recibe el identificador unico de la clase
     * @param nombre Recibe el nombre del usuario
     */
    public Administrador(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    /**
     * Método que permite asignar un identificador al usuario
     * @param id Recibe el identificador asignado
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * Método que permite obtener el identificar del usuario
     * @return Devuelve el identificador asignado
     */
    public int getId(){
        return id;
    }
    
    /**
     * Método que permite asignar nombre al usuario
     * @param nombre Recibe el nombre asignado
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Método que permite obtener el nombre del usuario
     * @return Devuelve el nombre asignado
     */
    public String getNombre(){
        return nombre;
    }
}
