/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author camper
 */
public class MenuItems implements MenuComponent {
    private String nombre;
    
    public MenuItems(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void print() {
        System.out.println("Menu Item: " + nombre);
    }
}
