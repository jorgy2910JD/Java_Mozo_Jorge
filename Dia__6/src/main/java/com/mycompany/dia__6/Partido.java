/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia__6;

/**
 *
 * @author camper
 */
public abstract class Partido {
    protected String equipoLocal;
    protected String equipoVisitante;
    protected int anotacionesLocal;
    protected int anotacionesVisitante;
    protected boolean partidoFinalizado;
    protected String fecha;
    
    public Partido(String equipoLocal, String equipoVisitante, String fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.anotacionesLocal = 0;
        this.anotacionesVisitante = 0;
        this.partidoFinalizado = false;
    }
    public void registrarPuntosLocal(int puntos) {
        if (!partidoFinalizado) {
            this.anotacionesLocal += puntos;
        }
    }

    public void registrarPuntosVisitante(int puntos) {
        if (!partidoFinalizado) {
            this.anotacionesVisitante += puntos;
        }
    }
     public String obtenerGanador() {
        if (!partidoFinalizado) {
            return "El partido no ha finalizado";
        }
        if (anotacionesLocal > anotacionesVisitante) {
            return equipoLocal;
        } else if (anotacionesVisitante > anotacionesLocal) {
            return equipoVisitante;
        } else {
            return "Empate";
        }
    }
     public void finalizarPartido() {
        this.partidoFinalizado = true;
    }

    public String obtenerInformacion() {
        return String.format("Partido entre %s y %s\nFecha: %s\nCestas Local: %d\nCestas Visitante: %d\nFinalizado: %b",
                equipoLocal, equipoVisitante, fecha, anotacionesLocal, anotacionesVisitante, partidoFinalizado);
    }
}
