/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author Jorge Mozo 
 */
public class Main {
    public static void main(String[] args) {
        // Crear las instancias de los subsistemas
        Projector projector = new Projector();
        Screen screen = new Screen();
        Lights lights = new Lights();
        SoundSystem soundSystem = new SoundSystem();
        
        // Crear la instancia del Facade
        HomeTheater homeTheater = new HomeTheater(projector, screen, lights, soundSystem);
        
        // Usar el Facade para controlar el sistema de cine
        homeTheater.startMovie();
        System.out.println();
        homeTheater.endMovie();
    }  
}
