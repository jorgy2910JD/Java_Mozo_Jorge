/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasql;
import java.util.Date;
/**
 *
 * @author camper
 */
public class Persona {
    private String nombre;
    private String titulo;
    private String direccion;
    private String telefono;
    private String email;
    private Date fechaNacimiento;

// Constructor 
public Persona (String nombre, String direccion, String titulo, Date fechaNacimiento, String telefono, String email) {
    this.nombre = nombre ;
    this.titulo = titulo;
    this.direccion = direccion;
    this.telefono = telefono;
    this.email = email;
    this.fechaNacimiento = fechaNacimiento;
    
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
 public String getTelefono() {
        return telefono;
    }
public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
public String getEmail() {
        return email;
    }
public void setEmail(String email) {
        this.email = email;
    }
 public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
 public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

// HECHO //

