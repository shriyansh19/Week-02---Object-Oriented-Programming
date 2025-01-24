// Base class: Employee
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    int teamSize;

    // Constructor
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {
    String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass: Intern
class Intern extends Employee {
    String university;

    // Constructor
    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

// Test the Employee Management System
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 80000, 10);
        Employee e2 = new Developer("Bob", 102, 70000, "Java");
        Employee e3 = new Intern("Charlie", 103, 30000, "MIT");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
