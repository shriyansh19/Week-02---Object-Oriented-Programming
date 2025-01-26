package rideHailingApplication;

// Subclass Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor for Auto
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    // Implementation of calculateFare
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Implementation of GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}
