package codes_in_note;

public class CountUpAndDown {

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countup(n - 1);
        }
    }

    public static void main(String[] args) {
        countup(3);
    }


}
