package exercises;

public class Exercise6 {

    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {

        //number=11
        if (number <= 1) return false;


        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if array elements are prime and their product is n
    public static boolean arePrimeFactors(int n, int[] array) {
        int product = 1;

        for (int num : array) {
            if (!isPrime(num)) {
                return false; // Not all numbers are prime
            }
            product *= num;
        }

        return product == n;
    }

    // Example usage
    public static void main(String[] args) {
        int n = 30;
        int[] factors = {2, 3, 5};
        System.out.println(arePrimeFactors(n, factors)); // Output: true
    }
}

