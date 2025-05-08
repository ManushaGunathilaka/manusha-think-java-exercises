package codes;

public class ForLoop1 {
    public static void main(String[] args) {

        for (int i = 2; i <= 8; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println("Who do we appreciate?");


        int n;
        for (n = 3; n > 0; n--) {
            System.out.println(n);
        }
        System.out.println("n is now " + n);
    }
}
