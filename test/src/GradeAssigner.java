import java.util.Scanner;

public class GradeAssigner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        //get inputs
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + " (1-100): ");
            int num = scanner.nextInt();

            while (num < 1 || num > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                System.out.print("Enter number " + (i + 1) + " (1-100): ");
                num = scanner.nextInt();
            }

            numbers[i] = num;
        }

        System.out.println("\nNumber and Grade:");
        // Print each number and its grade
        for (int i = 0; i < 10; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + " => Grade: ");

            if (num >= 90) {
                System.out.println("A");
            } else if (num >= 80) {
                System.out.println("B");
            } else if (num >= 70) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }

        scanner.close();
    }
}
