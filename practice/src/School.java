// It contains objects of Student and Course classes
public class School {

    String schoolName;      // Name of the school
    Student student;        // A student object (from Student class)
    Course course;          // A course object (from Course class)

    // Constructor to initialize School with a student and course
    public School(String schoolName, Student student, Course course) {
        this.schoolName = schoolName;
        this.student = student;
        this.course = course;
    }

    // Method to print complete school details
    public void printSchoolDetails() {
        System.out.println("School Name: " + schoolName);

        System.out.println("----- Student Info -----");
        student.printStudent();       // Calling method from Student object

        System.out.println("----- Course Info ------");
        course.printCourse();         // Calling method from Course object
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Create a student object
        Student s = new Student("Manusha", 22);

        // Create a course object
        Course c = new Course("Java Programming", 3);

        // Create a school object that contains the student and course
        School school = new School("IT Academy", s, c);

        // Print all school details
        school.printSchoolDetails();
    }
}
