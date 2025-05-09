package exercises;

public class Exercise1 {
    public static void main(String[] args) {
        singSong(3); // You can change this to 99 when you're ready
    }

    public static void singSong(int n) {
        if (n == 0) {
            printFinalVerse();
        } else {
            printVerse(n);
            singSong(n - 1); // Recursive call
        }
    }

    // Method to print one standard verse
    public static void printVerse(int n) {
        System.out.println(n + " bottles of beer on the wall,");
        System.out.println(n + " bottles of beer,");
        System.out.println("ya take one down, ya pass it around,");
        System.out.println((n - 1 == 0 ? "No" : (n - 1)) + " bottles of beer on the wall.");
        System.out.println(); // blank line for spacing
    }

    // Final verse when there are no bottles left
    public static void printFinalVerse() {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya can't take one down, ya can't pass it around,");
        System.out.println("cause there are no more bottles of beer on the wall!");
    }
}
