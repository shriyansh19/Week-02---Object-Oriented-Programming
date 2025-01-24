class Employee {
    String name; // Attribute to store employee name
    int id;      // Attribute to store employee ID
    double salary; // Attribute to store employee salary

    // Constructor to initialize employee attributes
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name); // Print employee name
        System.out.println("ID: " + id);     // Print employee ID
        System.out.println("Salary: " + salary); // Print employee salary
    }

    public static void main(String[] args) {
        // Create an employee object with sample data
        Employee emp = new Employee("John Doe", 101, 75000.50);

        // Call method to display details
        emp.displayDetails();
    }
}
