package vehicleRentalSystem;

// Subclass Bike extending Vehicle and implementing Insurable
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor to initialize Bike
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implementation of calculateRentalCost method
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implementation of calculateInsurance method
    @Override
    public double calculateInsurance() {
        return 100; // Fixed insurance cost for bikes
    }

    // Implementation of getInsuranceDetails method
    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance Policy Number: " + insurancePolicyNumber);
    }
}
