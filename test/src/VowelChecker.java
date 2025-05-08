import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        boolean hasVowel = false;

        // Check for vowels
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
                break;
            }
        }

        // Output result
        if (hasVowel) {
            System.out.println("The word contains at least one vowel.");
        } else {
            System.out.println("The word does not contain any vowels.");
        }

        scanner.close();
    }
}
