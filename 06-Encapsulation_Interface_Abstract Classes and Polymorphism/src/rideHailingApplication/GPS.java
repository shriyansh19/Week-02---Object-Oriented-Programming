package rideHailingApplication;

// Interface GPS
interface GPS {
    // Method to get current location
    String getCurrentLocation();

    // Method to update location
    void updateLocation(String location);
}
