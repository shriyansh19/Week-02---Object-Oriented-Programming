import java.util.ArrayList;

// Represents a course in the university
class Course {
    private String courseName; // Name of the course

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Represents a student in the university
class Student {
    private String name; // Name of the student
    private ArrayList<Course> enrolledCourses; // List of courses the student is enrolled in

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enrolls the student in a course
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    // Displays the courses the student is enrolled in
    public void displayCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Represents a professor in the university
class Professor {
    private String name; // Name of the professor

    public Professor(String name) {
        this.name = name;
    }

    public void assignProfessor(Course course) {
        System.out.println(name + " is teaching " + course.getCourseName());
    }
}

public class UniversitySystemDemo {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Create students
        Student student1 = new Student("Carlos Alcaraz");
        Student student2 = new Student("Chrish Evans");

        // Create professors
        Professor professor1 = new Professor("Dr. Strange");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Assign professor to a course
        professor1.assignProfessor(course1);

        // Display courses for each student
        student1.displayCourses();
        student2.displayCourses();
    }
}
