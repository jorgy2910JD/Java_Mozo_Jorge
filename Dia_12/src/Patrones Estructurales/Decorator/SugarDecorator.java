/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author camper
 */
public class SugarDecorator  extends BeverageDecorator{
     public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Azúcar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 500; // Costo adicional por azúcar
    }
}
