package rideHailingApplication;

// Main class
public class RideHailingApplication {
    // Method to calculate fares for different vehicle types
    public static void processVehicles(Vehicle[] vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));

            // Check if vehicle has GPS functionality
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println("------------------------------------");
        }
    }

    public static void main(String[] args) {
        // Create instances of Car, Bike, and Auto
        Vehicle[] vehicles = {
                new Car("C001", "Roger Federer", 10.0),
                new Bike("B002", "Rafael Nadal", 5.0),
                new Auto("A003", "Carlos Alcaraz", 7.0)
        };

        // Update locations for vehicles
        ((GPS) vehicles[0]).updateLocation("Downtown");
        ((GPS) vehicles[1]).updateLocation("Airport");
        ((GPS) vehicles[2]).updateLocation("City Center");

        // Process vehicles and calculate fares
        double distance = 15.0; // Example distance
        processVehicles(vehicles, distance);
    }
}
