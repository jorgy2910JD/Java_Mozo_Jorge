/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia1;

/**
 *
 * @author camper
 */
public class Notas {
    private double notaTeoria;
    private double notaPractica;
    private double notaAdicional;
    
      public Notas(double notaTeoria, double notaPractica, double notaAdicional) {
        this.notaTeoria = notaTeoria;
        this.notaPractica = notaPractica;
        this.notaAdicional = notaAdicional;
    }
     public double getNotaTeoria() {
        return notaTeoria;
    }

    public void setNotaTeoria(double notaTeorica) {
        this.notaTeoria = notaTeorica;
    }

    public double getNotaPractica() {
        return notaPractica;
    }

    public void setNotaPractica(double notaPractica) {
        this.notaPractica = notaPractica;
    }

    public double getNotaAdicional() {
        return notaAdicional;
    }

    public void setNotaAdicional(double notaAdicional) {
        this.notaAdicional = notaAdicional;
    }

    public double calcularNotaFinal() {
        return (notaTeoria * 0.3) + (notaPractica * 0.6) + (notaAdicional * 0.1);
    }

}

