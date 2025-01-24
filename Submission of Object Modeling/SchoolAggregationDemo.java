import java.util.ArrayList;

// Represents a student in a school
class Student {
    private String name; // Name of the student
    private ArrayList<Course> courses; // List of courses the student is enrolled in

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enrolls the student in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Associate this student with the course
    }

    // Displays all courses the student is enrolled in
    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// Represents a course that students can enroll in
class Course {
    private String courseName; // Name of the course
    private ArrayList<Student> students; // List of students enrolled in the course

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Adds a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Displays all students enrolled in the course
    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Represents a school containing multiple students
class School {
    private String schoolName; // Name of the school
    private ArrayList<Student> students; // List of students in the school

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Adds a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Displays all students in the school
    public void viewStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class SchoolAggregationDemo {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Marshall School of Law");

        // Create students
        Student student1 = new Student("Tony Stark");
        Student student2 = new Student("Aaemond Targerayan");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll students in courses
        student1.enrollInCourse(math);
        student2.enrollInCourse(math);
        student2.enrollInCourse(science);

        // View students in the school
        school.viewStudents();

        // View courses for each student
        student1.viewCourses();
        student2.viewCourses();

        // View students in each course
        math.viewEnrolledStudents();
        science.viewEnrolledStudents();
    }
}
