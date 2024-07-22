/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia1;

/**
 *
 * @author jorgy
 */
public class Trainers {
    private String id;
    private String nombres;
    private String apellidos;
    private String especialidad;
    
    public Trainers(String id, String nombres, String apellidos, String especialidad) {
        this.id = id;
        this.nombres = nombres;
        this. apellidos = apellidos; 
        this.especialidad = especialidad;
    }
    public String getId() {
        return id;
    }
    

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}