/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_10;

/**
 *
 * @author Jorge Mozo 
 */
// Producto
interface Transport {
    void deliver();
}

// Productos concretos
class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Entregando por tierra en una caja.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Entregando por mar en un contenedor.");
    }
}

// Fábrica
abstract class TransportFactory {
    public abstract Transport createTransport();
}

// Fábricas concretas
class RoadLogistics extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

// Uso del Factory Method
public class Main {
    public static void main(String[] args) {
        TransportFactory roadLogistics = new RoadLogistics();
        Transport roadTransport = roadLogistics.createTransport();
        roadTransport.deliver(); // Entregando por tierra en una caja.

        TransportFactory seaLogistics = new SeaLogistics();
        Transport seaTransport = seaLogistics.createTransport();
        seaTransport.deliver(); // Entregando por mar en un contenedor.
    }
}
