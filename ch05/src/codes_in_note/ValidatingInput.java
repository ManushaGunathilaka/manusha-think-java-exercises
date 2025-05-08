package codes_in_note;

import java.util.Scanner;

public class ValidatingInput {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (in.hasNextDouble()) {   //  First check if it is a double
            double x = in.nextDouble();
            System.out.println("You entered: " + x);
        } else {                    //  It's not a number
            String word = in.next();
            System.out.println("\"" + word + "\" is not a number");
        }

    }
}

