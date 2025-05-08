package codes;

public class While1 {
    public static void main(String[] args) {
        int n = 3;
        while (n > 0) {
            System.out.println(n);
            n = n- 1;
        }
        System.out.println("Blastoff!");

        int i = 2;
        while (i <= 8) {
            System.out.print(i + ", ");
            i += 2; // add 2 to i
        }
        System.out.println("Who do we appreciate?");
    }
}
