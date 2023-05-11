/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cecilia.model;

/**
 *
 * @author escob
 */
public class Contacto {
    //atributos del modelo
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String descripcion;
    
    //constructor vacio
    
    public Contacto(){
        
    }
    
    //getters y setters
    
     public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
     
     public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    
     public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    
      public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
     
}
