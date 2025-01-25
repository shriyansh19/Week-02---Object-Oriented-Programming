package vehicleRentalSystem;

// Subclass Truck extending Vehicle and implementing Insurable
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor to initialize Truck
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implementation of calculateRentalCost method
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% extra charge for trucks
    }

    // Implementation of calculateInsurance method
    @Override
    public double calculateInsurance() {
        return 1000; // Fixed insurance cost for trucks
    }

    // Implementation of getInsuranceDetails method
    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Policy Number: " + insurancePolicyNumber);
    }
}
