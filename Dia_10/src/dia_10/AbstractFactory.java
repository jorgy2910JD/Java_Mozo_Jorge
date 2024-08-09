/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_10;

/**
 *
 * @author Jorge Mozo 
 */
public class AbstractFactory {
    // Productos abstractos
interface Chair {
    void sitOn();
}

interface Table {
    void use();
}

// Productos concretos
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentado en una silla moderna.");
    }
}

class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("Usando una mesa moderna.");
    }
}

class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentado en una silla victoriana.");
    }
}

class VictorianTable implements Table {
    @Override
    public void use() {
        System.out.println("Usando una mesa victoriana.");
    }
}

// Fábrica abstracta
interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}

// Fábricas concretas
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}

// Uso del Abstract Factory
public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        modernChair.sitOn(); // Sentado en una silla moderna.
        modernTable.use();   // Usando una mesa moderna.

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();
        victorianChair.sitOn(); // Sentado en una silla victoriana.
        victorianTable.use();    // Usando una mesa victoriana.
    }
}

}
