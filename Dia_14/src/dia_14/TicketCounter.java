/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_14;

/**
 *
 * @author camper
 */
public class TicketCounter {
   private int availableTickets;

    public TicketCounter(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public synchronized void buyTicket(String buyerName) {
        if (availableTickets > 0) {
            System.out.println(buyerName + " ha comprado una entrada.");
            availableTickets--;
        } else {
            System.out.println(buyerName + " no pudo comprar una entrada. Entradas agotadas.");
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }  
}
