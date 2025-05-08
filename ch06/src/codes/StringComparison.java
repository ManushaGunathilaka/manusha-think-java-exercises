package codes;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Play again? ");
        String answer = in.nextLine();
        if (answer.equals("yes")) {
            // wrong!
            System.out.println("Let's go!");
        } else {
            System.out.println("Goodbye!");
        }
    }
}
