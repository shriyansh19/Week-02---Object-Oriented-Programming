import java.util.ArrayList;

// Represents an employee in a department
class Employee {
    private String name; // Name of the employee

    // Constructor to initialize the employee with a name
    public Employee(String name) {
        this.name = name;
    }

    // Displays the employee's name
    public void displayEmployee() {
        System.out.println("Employee: " + name);
    }
}

// Represents a department within a company
class Department {
    private String name; // Name of the department
    private ArrayList<Employee> employees; // List of employees in the department

    // Constructor to initialize the department with a name
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Adds an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Displays the department name and all its employees
    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            employee.displayEmployee();
        }
    }
}

// Represents a company that contains multiple departments
class Company {
    private String name; // Name of the company
    private ArrayList<Department> departments; // List of departments in the company

    // Constructor to initialize the company with a name
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Adds a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Displays the company name and all its departments with employees
    public void displayCompany() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDepartment();
        }
    }
}

// Main class to demonstrate the composition relationship
public class CompanyCompositionDemo {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Create departments
        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");

        // Create employees
        Employee emp1 = new Employee("Bruce Wayne");
        Employee emp2 = new Employee("Clark Kent");
        Employee emp3 = new Employee("Steve Rogers");

        // Add employees to departments
        dept1.addEmployee(emp1);
        dept1.addEmployee(emp2);
        dept2.addEmployee(emp3);

        // Add departments to the company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Display the company with its departments and employees
        company.displayCompany();
    }
}
