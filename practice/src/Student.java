public class Student {

    String name;    // Student's name
    int age;        // Student's age

    // Constructor to initialize Student
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print student details
    public void printStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }
}