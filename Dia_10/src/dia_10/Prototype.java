/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_10;

/**
 *
 * @author Jorge Mozo
 */
// Interfaz Clonable
interface Prototype extends Cloneable {
    Prototype clone();
}

// Clase concreta que implementa Prototype
class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{name='" + name + "'}";
    }
}

// Uso del Prototype
public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype 1");
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();

        System.out.println(prototype1);  // ConcretePrototype{name='Prototype 1'}
        System.out.println(prototype2);  // ConcretePrototype{name='Prototype 1'}

        prototype2.setName("Prototype 2");

        System.out.println(prototype1);  // ConcretePrototype{name='Prototype 1'}
        System.out.println(prototype2);  // ConcretePrototype{name='Prototype 2'}
    }
}

