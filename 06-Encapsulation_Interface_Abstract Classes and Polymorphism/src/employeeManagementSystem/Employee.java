package employeeManagementSystem;

// Abstract class Employee
abstract class Employee {
    // Fields for employeeId, name, and baseSalary
    private int employeeId;
    private String name;
    protected double baseSalary;

    // Constructor to initialize fields
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

