package employeeManagementSystem;

class PartTimeEmployee extends Employee implements Department {
    // Constructor to initialize PartTimeEmployee
    public PartTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Implementation of calculateSalary method
    @Override
    public double calculateSalary() {
        return super.baseSalary;
    }

    // Implementation of assignDepartment method
    @Override
    public void assignDepartment(String departmentName) {
        System.out.println("Assigned to department: " + departmentName);
    }

    // Implementation of getDepartmentDetails method
    @Override
    public void getDepartmentDetails() {
        System.out.println("This is a part-time employee's department.");
    }
}
