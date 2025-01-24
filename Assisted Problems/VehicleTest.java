// Superclass: Vehicle
class Vehicle {
    int maxSpeed;
    String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle info
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    int seatCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    double payloadCapacity;

    // Constructor
    public Truck(int maxSpeed, String fuelType, double payloadCapacity) {
        super(maxSpeed, fuelType);
        this.payloadCapacity = payloadCapacity;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Test the Vehicle and Transport System
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car(180, "Petrol", 5);
        Vehicle v2 = new Truck(120, "Diesel", 15.5);
        Vehicle v3 = new Motorcycle(150, "Petrol", true);

        v1.displayInfo();
        v2.displayInfo();
        v3.displayInfo();
    }
}
