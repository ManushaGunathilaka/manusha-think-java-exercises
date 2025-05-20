import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {

        int MAX_GUESSES = 3;
        int guessus = 0;

        while (guessus<MAX_GUESSES){
            guessus++;

            Random random = new Random();
            int number = random.nextInt(2) + 1;

            Scanner in = new Scanner(System.in);
            System.out.print("Type a number: ");
            int userNumber = in.nextInt();
            System.out.println("Your guess is: "+userNumber);

            System.out.println("The number I was thinking of is: "+number);

            if(number==userNumber){
                System.out.println("You Win");
                return;
            }else {
                int difference = Math.abs(userNumber-number);
                System.out.println("You were off by: "+difference);

                if(number<userNumber){
                    System.out.println("guess is too high");
                }else {
                    System.out.println("guess is too low");
                }

                System.out.println("Retry");
            }
        }




    }
}

