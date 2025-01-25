package vehicleRentalSystem;

// Subclass Car extending Vehicle and implementing Insurable
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor to initialize Car
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
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
        return 500; // Fixed insurance cost for cars
    }

    // Implementation of getInsuranceDetails method
    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance Policy Number: " + insurancePolicyNumber);
    }
}
