/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasql;
import java.util.Date;
import java.util.List;
/**
 *
 * @author camper
 */
public class Pabellon {
    private String nombre;
    private int capacidad;
    private List<Paciente> pacientes;

    public Pabellon(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public boolean estaDisponible() {
        return pacientes.size() < capacidad;
    }
// getters y setters para cada campo
    public String getNombre () {
        return nombre ;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public int getCapacidad () {
        return capacidad ;
    }
    public void setCapacidad (int capacidad) {
        this.capacidad = capacidad;
    }
}



// HECHO //
