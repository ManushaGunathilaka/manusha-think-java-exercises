package ex1;

public class Student {

    String name;
    int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void print(){
        System.out.println(name+" is "+age+" years old!");
    }
}
