/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_7;
import java.time.LocalDate;

/**
 *
 * @author Jorge Luis Mozo
 */
public abstract class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int anotacionesLocal;
    private int anotacionesVisitante;
    private LocalDate fecha;
    private boolean PartidoFinalizado;
    
    
    public Partido (String equipoLocal, String equipoVisitante, LocalDate fecha){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.anotacionesLocal = 0;
        this.anotacionesVisitante = 0;
        this.PartidoFinalizado = false;    
    }
     public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }
  public int getAnotacionesLocal() {
        return anotacionesLocal;
    }

    public int getAnotacionesVisitante() {
        return anotacionesVisitante; 
    }
    public boolean isPartidoFinalizado() {
        return PartidoFinalizado;
    }

    public LocalDate getFecha() {
        return fecha;
    }
     public void finalizarPartido() {
        this.PartidoFinalizado = true;
    }
     public abstract String obtenerGanador();

    public String obtenerInformacionBasica() {
        return "Local: " + equipoLocal + ", Visitante: " + equipoVisitante + ", Fecha: " + fecha;
    }
    
}
