/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploconcurrencia;

/**
 *
 * @author camper
 */
public class Carrera {
    public static void main(String[] args) {
         Atletas atleta1 = new Atletas("Atleta 1");
        Atletas atleta2 = new Atletas("Atleta 2");
        Atletas atleta3 = new Atletas("Atleta 3");
        Atletas atleta4 = new Atletas("Atleta 4");

        // Los atletas comienzan a correr en orden
        atleta1.start();
        try {
            atleta1.join(); // Espera a que el atleta 1 termine antes de empezar el siguiente
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        atleta2.start();
        try {
            atleta2.join(); // Espera a que el atleta 2 termine antes de empezar el siguiente
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        atleta3.start();
        try {
            atleta3.join(); // Espera a que el atleta 3 termine antes de empezar el siguiente
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        atleta4.start();
        try {
            atleta4.join(); // Espera a que el atleta 4 termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("La carrera ha terminado.");
    } 
}
    
