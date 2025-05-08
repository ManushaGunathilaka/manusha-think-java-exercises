package exercises;

public class Exercise4 {

    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;
        int loVal =-999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";

        System.out.println("1 "+(yes == no || grade > amount));
        //System.out.println( amount == 40.0 || 50.0);
        System.out.println("3 "+(hiVal != loVal || loVal < 0));
        System.out.println("4 "+( true || hello.length() > 0));
        System.out.println("5 "+( hello.isEmpty() && yes));
        System.out.println("7 "+( !yes || no));
    }
}
