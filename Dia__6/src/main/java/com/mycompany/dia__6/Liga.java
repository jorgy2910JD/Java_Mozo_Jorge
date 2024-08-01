/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia__6;

/**
 *
 * @author camper
 */
public class Liga  extends Partido{
    private int jornada;
    
        public Liga(String equipoLocal, String equipoVisitante, String fecha, int jornada) {
        super(equipoLocal, equipoVisitante, fecha);
        this.jornada = jornada;
    }
   @Override
    
   public String obtenerInformacion() {
        return super.obtenerInformacion() + String.format("\nJornada: %d", jornada);
    }
    
}
