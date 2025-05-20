public class Course {

    String courseName;      // Name of the course
    int durationMonths;     // Duration of the course in months

    // Constructor to initialize Course
    public Course(String courseName, int durationMonths) {
        this.courseName = courseName;
        this.durationMonths = durationMonths;
    }

    // Method to print course details
    public void printCourse() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + durationMonths + " months");
    }
}