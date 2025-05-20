package codes_in_note;

public class Test {
    public static void main(String[] args) {

        int x=4;
        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        if (x > 0)
            System.out.println("x is positive");
        System.out.println("x is not zero");

        int y = 1;
        if (y % 2 == 0)
            ; // empty statement
        {
            System.out.println("x is even");
        }
    }
}
