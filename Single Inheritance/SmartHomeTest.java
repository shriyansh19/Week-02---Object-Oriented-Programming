// Superclass: Device
class Device {
    String deviceId;
    String status;

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    double temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display thermostat settings
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Test the Smart Home Device System
public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("Thermo001", "On", 22.5);
        thermostat.displayStatus();
    }
}
