/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploconcurrencia;

/**
 *
 * @author camper
 */
public class Atletas extends Thread {
    private static Testigo testigo = new Testigo();
    private String nombre;
    private long tiempoInicio, tiempoFin;

    public Atletas(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            // Tomar el testigo
            testigo.tomar();
            System.out.println(nombre + " ha tomado el testigo y comienza a correr.");

            tiempoInicio = System.currentTimeMillis();

            // Correr
            Thread.sleep((long) (9000 + Math.random() * 2000)); // Simula el tiempo de carrera entre 9 y 11 segundos

            tiempoFin = System.currentTimeMillis();
            System.out.println(nombre + " ha terminado su carrera en " + (tiempoFin - tiempoInicio) / 1000.0 + " segundos.");

            // Soltar el testigo
            testigo.soltar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
