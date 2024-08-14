/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Adapter;

/**
 *
 * @author Jorge Mozo
 */
public class Main {
    public static void main(String[] args) {
// Pago utilizando la tarjeta de crédito a través del adaptador
        OldCreditCardPayment oldCreditCardPayment = new OldCreditCardPayment();
        PaymentProcessor creditCardAdapter = new CreditCardAdapter(oldCreditCardPayment);
        creditCardAdapter.pay(250000);
    }
}
