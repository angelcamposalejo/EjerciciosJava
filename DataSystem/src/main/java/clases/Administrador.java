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
    private int id;
    private String nombre;
    
    public Administrador(){
        
    }
    
    public Administrador(int id){
        this.id = id;
    }
    
    public Administrador(String nombre){
        this.nombre = nombre;
    }
    
    public Administrador(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
}
