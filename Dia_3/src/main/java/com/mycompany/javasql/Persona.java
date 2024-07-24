/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasql;

/**
 *
 * @author camper
 */
public class Persona {
    private String nombre;
    private String titulo;
    private String direccion;

// Constructor 
public Persona (String nombre, String direccion, String titulo) {
    this.nombre = nombre ;
    this.titulo = titulo;
    this.direccion = direccion;
    
}

//getters para cada campo 
public String getNombre () {
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getTitulo () {
    return titulo;
}
public void setTitulo (String titulo) {
    this.titulo = titulo;
}

public String getDireccion (){
    return direccion;
}
public void setDireccion (String direccion) {
    this.direccion = direccion; 
}

}
