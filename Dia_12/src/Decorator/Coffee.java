/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author camper
 */
public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 3500; // Costo del café
    }
}
