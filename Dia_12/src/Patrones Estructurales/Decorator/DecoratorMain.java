/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author camper
 */
public class DecoratorMain {
     public static void main(String[] args) {
        // Crear una bebida base (Café)
        Beverage myCoffee = new Coffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        // Añadir leche a la bebida
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        // Añadir azúcar a la bebida
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " TOTAL: "+  " $" + myCoffee.cost());
    }
}
