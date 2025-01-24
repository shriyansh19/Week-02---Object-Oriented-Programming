class Circle {
    double radius; // Attribute to store the radius of the circle

    // Constructor to initialize the radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    double calculateArea() {
        return Math.PI * radius * radius; // Formula: π * r²
    }

    // Method to calculate the circumference of the circle
    double calculateCircumference() {
        return 2 * Math.PI * radius; // Formula: 2 * π * r
    }

    // Method to display circle details
    void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius); // Print radius
        System.out.println("Area: " + calculateArea()); // Print area
        System.out.println("Circumference: " + calculateCircumference()); // Print circumference
    }

    public static void main(String[] args) {
        // Create a circle object with a given radius
        Circle circle = new Circle(5.0);

        // Call method to display circle details
        circle.displayDetails();
    }
}
