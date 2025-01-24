// Base Class: Person
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayRole() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Role: Student, Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Role: Staff, Department: " + department);
    }
}

// Test the School System
public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 40, "Math");
        teacher.displayRole();
    }
}
