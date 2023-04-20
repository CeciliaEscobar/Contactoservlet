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
    private String nombre;
    private String apellido;
    private String email;
    private String descripcion;
    
    //constructor vacio
    
    public Contacto(){
        
    }
    
    //getters y setters
    
    public String getNombre(){
     return nombre;
    }
    
    public void setNombre(String name){
        this.nombre = name;
    }
}
