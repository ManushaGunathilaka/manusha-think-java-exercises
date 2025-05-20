package exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        int userNumber = in.nextInt();
        System.out.println("Your guess is: "+userNumber);

        System.out.println("The number I was thinking of is: "+number);

        if(number==userNumber){
            System.out.println("You Win");
        }else {
            int difference = Math.abs(userNumber-number);
            System.out.println("You were off by: "+difference);
        }



    }
}

