/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author jorgy
 */
public class HomeTheater {
    private Projector projector;
    private Screen screen;
    private Lights lights;
    private SoundSystem soundSystem;
    
    public HomeTheater(Projector projector, Screen screen, Lights lights, SoundSystem soundSystem) {
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.soundSystem = soundSystem;
    }
    
    public void startMovie() {
        System.out.println("Preparando para ver la película...");
        lights.dim();
        screen.down();
        projector.on();
        soundSystem.on();
        System.out.println("¡Todo listo, que disfrutes la película!");
    }
    
    public void endMovie() {
        System.out.println("Terminando la película...");
        lights.on();
        screen.up();
        projector.off();
        soundSystem.off();
        System.out.println("¡Gracias por ver la película!");
    }
}
