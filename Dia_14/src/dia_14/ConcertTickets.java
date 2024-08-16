/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_14;

/**
 *
 * @author camper
 */
public class ConcertTickets {
     public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter(10);  // 10 entradas disponibles

        // suposicion de  15 usuarios intentando comprar entradas al mismo tiempo
        Thread[] buyers = new Thread[15];
        for (int i = 0; i < 15; i++) {
            buyers[i] = new BuyerThread(ticketCounter, "Comprador " + (i + 1));
            buyers[i].start();
        }

        for (int i = 0; i < 15; i++) {
            try {
                buyers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Entradas disponibles al final: " + ticketCounter.getAvailableTickets());
    }
}
