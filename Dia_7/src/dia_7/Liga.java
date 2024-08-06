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
public class Liga extends Partido {
   private int jornada;
   
   public Liga(String equipoLocal, String equipoVisitante, LocalDate fecha, int jornada) {
        super(equipoLocal, equipoVisitante, fecha);
        this.jornada = jornada; 
    }
   public int getJornada() {
        return jornada;
    }
   public String obtenerGanador() {
        if (getAnotacionesLocal() > getAnotacionesVisitante()) {
            return getEquipoLocal();
        } else if (getAnotacionesVisitante() > getAnotacionesLocal()) {
            return getEquipoVisitante();
        } else {
            return "Empate";
        }
    }
}
