class Student {
    String name;        // Attribute to store student's name
    int rollNumber;     // Attribute to store student's roll number
    double marks;       // Attribute to store student's marks

    // Constructor to initialize student attributes
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    // Method to display student details and grade
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        // Create a student object
        Student student = new Student("Alice", 101, 85.5);

        // Display student details
        student.displayDetails();
    }
}
