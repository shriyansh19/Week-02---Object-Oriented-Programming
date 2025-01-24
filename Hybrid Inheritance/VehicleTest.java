// Interface: Refuelable
interface Refuelable {
    void refuel();
}

// Superclass: Vehicle
class Vehicle {
    String model;
    int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println("Charging the electric vehicle.");
    }
}

// Subclass: PetrolVehicle (implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle.");
    }
}

// Test the Vehicle Management System
public class VehicleTest {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 200);
        PetrolVehicle pv = new PetrolVehicle("Toyota Camry", 180);

        ev.charge();
        pv.refuel();
    }
}
