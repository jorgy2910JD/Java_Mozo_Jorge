/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasql;

/**
 *
 * @author camper
 */
public class Personal {
    private String fechaVinculacion;
    private double salario;
    private Hospital hospital;
    
    // constructor
   public Personal (String fechaVinculacion, double salario, Hospital hospital ) {
       this.fechaVinculacion = fechaVinculacion;
       this.salario = salario;
       this.hospital = hospital;
   }
   
  // getters y setters para cada campo
   public String getfechaVinculacion () {
       return fechaVinculacion;
   }
   public void setFechaVinculacion (String fechaVinculacion){
       this.fechaVinculacion = fechaVinculacion;
   }
   
   public double getSalario () {
       return salario;
   }
   public void setSalario (double salario) {
       this.salario = salario;
   }
   public Hospital getHospital () {
       return hospital; 
   }
}
