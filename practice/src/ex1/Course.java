package ex1;

public class Course {

    String courseName;
    int durationMonths;

    public Course(String courseName,int durationMonths){
        this.courseName=courseName;
        this.durationMonths=durationMonths;
    }

    public void print(){
        System.out.println(courseName+" has "+durationMonths+" months duration.");
    }
}
