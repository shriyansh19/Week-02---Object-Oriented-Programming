package employeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create FullTimeEmployee object
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Alice", 50000);
        fullTimeEmployee.assignDepartment("Engineering");
        fullTimeEmployee.displayDetails();
        System.out.println("Calculated Salary: " + fullTimeEmployee.calculateSalary());
        fullTimeEmployee.getDepartmentDetails();
        System.out.println();

        // Create PartTimeEmployee object
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Bob", 20000);
        partTimeEmployee.assignDepartment("HR");
        partTimeEmployee.displayDetails();
        System.out.println("Calculated Salary: " + partTimeEmployee.calculateSalary());
        partTimeEmployee.getDepartmentDetails();
    }
}