/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasql;

/**
 *
 * @author camper
 */
public class Departamento {
   private int id;
   private String nombre;
   private Hospital hospital; // hacer una relacion con el hospital
   
// constructor
   public Departamento ( int id, Hospital hospital, String nombre) {
       this.id = id;
       this.nombre = nombre;
       this.hospital = hospital;
   }
   // getters para cada campo 
   public int getId () {
       return id;
   }
   public Hospital getHospital () {
       return hospital; 
   }
   public String getNombre () {
       return nombre;
   }
   // metodo para poner los datos del Departamento como cadema de texto
    @Override
    public String toString() {
        return "Departamento{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", hospital='" + hospital + '\'' +
                '}';
}
}

// HECHO //



