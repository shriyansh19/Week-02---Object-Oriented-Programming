// Base Class: Course
class Course {
    String courseName;
    int duration;

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}

// Test the Educational Course Hierarchy
public class CourseTest {
    public static void main(String[] args) {
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 10, "Udemy", true, 100, 20);
        paidCourse.displayCourseInfo();
    }
}
