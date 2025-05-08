import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();

            if (num >= 100 && num <= 1000) {
                if (num % 100 == 0) {
                    System.out.println("yes!");
                    flag = false;
                }
            }
        }

        in.close();
    }
}
