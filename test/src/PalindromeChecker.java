import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if string is palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();
        String cleanInput = input.toLowerCase();


        // Check if palindrome
        if (isPalindrome(cleanInput)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

    }
}