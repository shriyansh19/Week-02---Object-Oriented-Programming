import java.util.List;

// Subject class
class Subject {
    private String subjectName;
    private int score;

    // Constructor
    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    // Getters
    public String getSubjectName() {
        return subjectName;
    }

    public int getScore() {
        return score;
    }

    // Method to display subject details
    public void displaySubject() {
        System.out.println("Subject: " + subjectName + ", Score: " + score);
    }
}

// Student class
class Student {
    private String name;
    private int rollNumber;
    private List<Subject> subjects; // Aggregation relationship

    // Constructor
    public Student(String name, int rollNumber, List<Subject> subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = subjects;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subjects:");
        for (Subject subject : subjects) {
            subject.displaySubject();
        }
    }
}

// GradeCalculator class
class GradeCalculator {

    // Method to retrieve student subjects
    public List<Subject> getSubjects(Student student) {
        return student.getSubjects();
    }

    // Method to calculate the average score of the student
    public double calculateAverage(List<Subject> subjects) {
        int totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }
        return totalScore / (double) subjects.size();
    }

    // Method to determine the grade based on the average score
    public String determineGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Method to compute grade for the student
    public void computeGrade(Student student) {
        List<Subject> subjects = getSubjects(student);
        double average = calculateAverage(subjects);
        String grade = determineGrade(average);

        System.out.println("\nGrade for " + student.getName() + ": " + grade);
    }
}

// Main class to demonstrate the program
public class SchoolResultsApp {
    public static void main(String[] args) {
        // Create subjects
        Subject math = new Subject("Math", 85);
        Subject science = new Subject("Science", 78);
        Subject english = new Subject("English", 92);

        // Create a student and associate the subjects
        List<Subject> subjects = List.of(math, science, english);
        Student student = new Student("John Doe", 101, subjects);

        // Display student details
        student.displayStudentDetails();

        // Calculate and display the grade
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.computeGrade(student);
    }
}
