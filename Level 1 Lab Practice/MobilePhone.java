class MobilePhone {
    String brand; // Attribute to store the phone's brand
    String model; // Attribute to store the phone's model
    double price; // Attribute to store the phone's price

    // Constructor to initialize mobile phone attributes
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand); // Print phone brand
        System.out.println("Model: " + model); // Print phone model
        System.out.println("Price: " + price); // Print phone price
    }

    public static void main(String[] args) {
        // Create a mobile phone object with sample data
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 79999.99);

        // Display phone details
        phone.displayDetails();
    }
}
