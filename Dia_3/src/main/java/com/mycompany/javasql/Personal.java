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
public class Personal {
    private Date fechaVinculacion;
    private double salario;
    private PersonaAdministrativo personaAdministrativo;
    private PersonaTecnico personaTecnico;
    private PersonaOperaciones personaOperaciones;
    public enum TipoPersonal {
        Administrativo, Tecnico, Operaciones
    }
    private Hospital hospital;
    private TipoPersonal tipoPersonal;
    
    // constructor
   public Personal (Date fechaVinculacion, double salario, Hospital hospital ,TipoPersonal tipoPersonal ) {
       this.fechaVinculacion = fechaVinculacion;
       this.salario = salario;
       this.hospital = hospital;
       this.tipoPersonal = tipoPersonal;
   }
   
  // getters y setters para cada campo
   public Date getfechaVinculacion () {
       return fechaVinculacion;
   }
   public void setFechaVinculacion (Date fechaVinculacion){
       this.fechaVinculacion = fechaVinculacion;
   }
   
   public double getSalario () {
       return salario;
   }
   public void setSalario (double salario) {
       this.salario = salario;
   }
       public TipoPersonal getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(TipoPersonal tipoPersonal) {
        this.tipoPersonal= tipoPersonal;
    }
   public Hospital getHospital () {
       return hospital; 
   }
   // Clases internar para información especifica de cada tipo de empleado
     public static class PersonaAdministrativo {
        // Atributos específicos para administrativos
    }

    public static class PersonaTecnico {
        // Atributos específicos para técnicos
    }

    public static class PersonaOperaciones{
        // Atributos específicos para operaciones
    }
}
