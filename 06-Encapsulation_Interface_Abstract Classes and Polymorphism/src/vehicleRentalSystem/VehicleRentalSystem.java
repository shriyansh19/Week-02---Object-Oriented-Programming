package vehicleRentalSystem;

public class VehicleRentalSystem {
    // Method to demonstrate polymorphism: calculate and print costs for a list of vehicles
    public static void processVehicles(Vehicle[] vehicles, int rentalDays) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                double insuranceCost = insurableVehicle.calculateInsurance();
                System.out.println("Insurance Cost: " + insuranceCost);
                insurableVehicle.getInsuranceDetails();
            }

            System.out.println("------------------------------------");
        }
    }

    public static void main(String[] args) {
        // Create instances of Car, Bike, and Truck
        Vehicle[] vehicles = {
                new Car("CAR123", 1000, "CARINS123"),
                new Bike("BIKE456", 200, "BIKEINS456"),
                new Truck("TRUCK789", 3000, "TRUCKINS789")
        };

        // Process the vehicles for a rental period of 5 days
        processVehicles(vehicles, 5);
    }
}
