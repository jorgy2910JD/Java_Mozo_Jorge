/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author camper
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
     // Crear ítems del menú
        MenuComponent home = new MenuItems("Inicio");
        MenuComponent profile = new MenuItems("Perfil");
        MenuComponent notifications = new MenuItems("Notificaciones");

        // Crear submenú de configuración
        Menu settingsMenu = new Menu("Settings");
        settingsMenu.add(profile);
        settingsMenu.add(notifications);

        // Crear menú principal
        Menu mainMenu = new Menu("Menu principal");
        mainMenu.add(home);
        mainMenu.add(settingsMenu);

        // Imprimir detalles del menú
        mainMenu.print();   
    }
}
