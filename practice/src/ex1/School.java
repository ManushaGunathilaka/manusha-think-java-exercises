package ex1;

public class School {

    String name;
    Student student;
    Course course;

    public School(String name,Student student, Course course){
        this.name=name;
        this.student=student;
        this.course=course;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Manusha",25);
        Course course1 = new Course("Java",6);

        School school = new School("Unviersity of Moratuwa",student1,course1);

        school.student.print();
        school.course.print();
    }
}
