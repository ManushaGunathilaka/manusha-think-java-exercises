package as;

public class Test {


    public static void main(String[] args) {

        Student s1= new Student("Manusha","11076","Kurunegala");
        Student s2= new Student("Kapila","11076","Kurunegala");
        System.out.println(s1.getName());

        s1.setName("Gunathilaka");
        System.out.println(s1.getName());

    }
}
