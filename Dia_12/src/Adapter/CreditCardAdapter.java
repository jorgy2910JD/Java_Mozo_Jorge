/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Jorge Mozo 
 */
public class CreditCardAdapter implements PaymentProcessor {
     private OldCreditCardPayment oldCreditCardPayment;

    public CreditCardAdapter(OldCreditCardPayment oldCreditCardPayment) {
        this.oldCreditCardPayment = oldCreditCardPayment;
    }

    @Override
    public void pay(int amount) {
        oldCreditCardPayment.makePayment(amount);
    }
}
