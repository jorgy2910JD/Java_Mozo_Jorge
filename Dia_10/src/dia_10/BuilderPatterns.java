/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_10;

/**
 *
 * @author Jorge Mozo 
 */
public class BuilderPatterns {
    // Producto complejo
class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}

// Interfaz Builder
interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}

// Builder concreto
class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Concrete structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Modern interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}

// Director
class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
// Uso del Builder
public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        Director director = new Director(builder);
        House house = director.constructHouse();
        System.out.println(house);  // House{foundation='Concrete foundation', structure='Concrete structure', roof='Concrete roof', interior='Modern interior'}
    }           
            
            
            

}