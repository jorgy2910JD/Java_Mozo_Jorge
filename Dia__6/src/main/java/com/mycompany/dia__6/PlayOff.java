/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia__6;

/**
 *
 * @author camper
 */
public class PlayOff extends Partido{
   private String ronda;
   
   public PlayOff(String equipoLocal, String equipoVisitante, String fecha, String ronda) {
        super(equipoLocal, equipoVisitante, fecha);
        this.ronda = ronda;
    }
   @Override
    public void finalizarPartido() {
        if (anotacionesLocal == anotacionesVisitante) {
            System.out.println("El partido sigue en juego. No se puede finalizar mientras esté empatado.");
        } else {
            super.finalizarPartido();
        }
    }
    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + String.format("\nRonda: %s", ronda);
    }
}
