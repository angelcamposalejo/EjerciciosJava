/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author angelcmapos
 */
public class PermisoAdministrador {
    private int id;
    private String nickname;
    private String pass;
    private boolean activo;
    private Administrador administrador;
    private Permiso permiso;
    
    public PermisoAdministrador(){
        
    }
    
    public PermisoAdministrador(int id){
        this.id = id;
    }
    
    public PermisoAdministrador(String nickname, String pass){
        this.nickname = nickname;
        this.pass = pass;
    }
    
    public PermisoAdministrador(String nickname, String pass, boolean activo,Administrador administrador, Permiso permiso){
        this.nickname = nickname;
        this.pass = pass;
        this.activo = activo;
        this.administrador = administrador;
        this.permiso = permiso;
    }
    
    public PermisoAdministrador(int id,String nickname, String pass, boolean activo,Administrador administrador, Permiso permiso){
        this.id = id;
        this.nickname = nickname;
        this.pass = pass;
        this.activo = activo;
        this.administrador = administrador;
        this.permiso = permiso;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    
    public String getNickname(){
        return nickname;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public String getPass(){
        return pass;
    }
    
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    
    public boolean getActivo(){
        return activo;
    }
    
    public void setAdministrador(Administrador administrador){
        this.administrador = administrador;
    }
    
    public Administrador getAdministrador(){
        return administrador;
    }
    
    public void setPermiso(Permiso permiso){
        this.permiso = permiso;
    }
    
    public Permiso getPermiso(){
        return permiso;
    }
}
