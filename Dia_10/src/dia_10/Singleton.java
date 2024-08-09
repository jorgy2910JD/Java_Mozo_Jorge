/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_10;

/**
 *
 * @author Jorge Mozo
 */
public class Singleton {
    // Instancia única de la clase
    private static Singleton instance;

    // Constructor privado para evitar la creación de nuevas instancias
    private Singleton() {}

    // Método para obtener la instancia única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Uso del Singleton
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); // true
    }
}

