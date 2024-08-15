/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camper
 */
public class Menu implements MenuComponent {
    private String nombre;
    private List<MenuComponent> components = new ArrayList<>();
    
    public Menu(String name) {
        this.nombre = nombre;
    }
    
     public void add(MenuComponent component) {
        components.add(component);
    }
     public void remove(MenuComponent component) {
        components.remove(component);
    } 
    @Override
    public void print() {
        System.out.println("Menu: " + nombre);
        for (MenuComponent component : components) {
            component.print();
        }
    }
}
