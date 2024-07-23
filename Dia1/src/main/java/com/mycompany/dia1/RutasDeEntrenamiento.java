/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia1;

import java.util.ArrayList;

/**
 *
 * @author jorgy
 */
public class RutasDeEntrenamiento {
   private Rutas ruta;
   private ArrayList<modulos> modulos;
   private int capacidad;
   private Trainers trainer;
   private ArrayList<Camper> campersAsignados;
   
   // Constructor
    public RutasDeEntrenamiento(Rutas ruta, int capacidad, Trainers trainer) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.trainer = trainer;
        this.modulos = new ArrayList<>();
        this.campersAsignados = new ArrayList<>();
    }
    public Rutas getRuta() {
        return ruta;
    }

    public void setRuta(Rutas ruta) {
        this.ruta = ruta;
    }

    public ArrayList<modulos> getmodulos() {
        return modulos;
    }

    public void agregarmodulos(modulos modulo) {
        this.modulos.add(modulo);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Trainers getTrainers() {
        return trainer;
    }

    public void setTrainers(Trainers trainer) {
        this.trainer = trainer;
    }
    public ArrayList<Camper> getCampersAsignados() {
        return campersAsignados;
    }
    public boolean agregarCamper(Camper camper) {
        if (this.campersAsignados.size() < this.capacidad) {
            this.campersAsignados.add(camper);
            return true;
        }
        return false;
    }
}