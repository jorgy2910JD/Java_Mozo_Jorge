/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_7;
import java.time.LocalDate;

/**
 *
 * @author jorgy
 */
public class PlayOffs extends Partido {
   private String ronda; 
   
   public PlayOffs(String equipoLocal, String equipoVisitante, LocalDate fecha, String ronda) {
        super(equipoLocal, equipoVisitante, fecha);
        this.ronda = ronda;
    }
    public String getRonda() {
        return ronda;
    }

    @Override
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
