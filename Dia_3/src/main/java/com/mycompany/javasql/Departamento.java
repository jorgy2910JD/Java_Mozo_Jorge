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
   private String nombre;
   private Hospital hospital; // hacer una relacion con el hospital
   
// constructor
   public Departamento (String nombre, Hospital hospital) {
       this.nombre = nombre;
       this.hospital = hospital;
   }
   // getters para cada campo 
   public String getNombre () {
       return nombre;
   }
   public Hospital getHospital () {
       return hospital; 
   }
}

