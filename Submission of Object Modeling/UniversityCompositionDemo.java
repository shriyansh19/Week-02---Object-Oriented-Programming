import java.util.ArrayList;

// Represents a faculty member in the university
class Faculty {
    private String name; // Name of the faculty member

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Represents a department within the university
class Department {
    private String name; // Name of the department

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Represents a university containing departments (composition) and faculties (aggregation)
class University {
    private String name; // Name of the university
    private ArrayList<Department> departments; // Departments within the university
    private ArrayList<Faculty> faculties; // Faculties associated with the university

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Adds a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Adds a faculty member to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Displays all departments in the university
    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
    }

    // Displays all faculty members in the university
    public void displayFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }
}

public class UniversityCompositionDemo {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Tech University");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        // Create faculties
        Faculty faculty1 = new Faculty("Dr. Stephen Strange");
        Faculty faculty2 = new Faculty("Dr. Shriyansh Kesharwani");

        // Add departments to the university (composition)
        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);

        // Add faculties to the university (aggregation)
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display departments and faculties
        university.displayDepartments();
        university.displayFaculties();
    }
}
