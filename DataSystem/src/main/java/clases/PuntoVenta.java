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
public class PuntoVenta {
    /**
     * Declaración de variables
     */
    private int id;
    private String tipo;
    private int activo;
    
    /**
     * Constructor vacio de la clase
     */
    public PuntoVenta(){
        
    }
    
    /**
     * Constructor útil para referenciar la clase
     * @param id Recibe el identificador unico de la clase
     */
    public PuntoVenta(int id){
        this.id = id;
    }
    
    /**
     * Constructor útil para registrar un punto de venta
     * @param tipo Recibe el nombre del punto de venta
     * @param activo Recibe el estado actual del punto de venta
     */
    public PuntoVenta(String tipo, int activo){
        this.tipo = tipo;
        this.activo = activo;
    }
    
    /**
     * Constructor útil para listar
     * @param id Recibe el identificador unico de la clase
     * @param tipo Recibe el nombre del punto de venta
     * @param activo Recibe el estado actual del punto de venta
     */
    public PuntoVenta(int id, String tipo, int activo){
        this.id = id;
        this.tipo = tipo;
        this.activo = activo;
    }
    
    /**
     * Método que permite asignar el identificador del punto de venta
     * @param id Recibe el identificador asignado
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * Método que permite obtener el identificador del punto de venta
     * @return Devuelve el identificador asignado
     */
    public int getId(){
        return id;
    }
    
    /**
     * Método que permite asignar nombre al punto de venta
     * @param tipo Recibe el nombre asignado
     */
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    /**
     * Método que permite obtener el nombre asignado al punto de venta
     * @return Devuelve el nombre asignado
     */
    public String getTipo(){
        return tipo;
    }
    
    /**
     * Método que permite asignar el estado del punto de venta
     * @param activo Recibe el estado asignado
     */
    public void setActivo(int activo){
        this.activo = activo;
    }
    
    /**
     * Método que permite obtener el estado del punto de venta
     * @return Devuelve el estado asignado
     */
    public int getActivo(){
        return activo;
    }
}
