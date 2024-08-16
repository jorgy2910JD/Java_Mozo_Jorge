/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_14;

/**
 *
 * @author camper
 */
public class BuyerThread  extends Thread{
    private TicketCounter ticketCounter;
    private String buyerName;

    public BuyerThread(TicketCounter ticketCounter, String buyerName) {
        this.ticketCounter = ticketCounter;
        this.buyerName = buyerName;
    }

    @Override
    public void run() {
        ticketCounter.buyTicket(buyerName);
    } 
}
