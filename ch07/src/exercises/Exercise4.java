package exercises;

import java.util.Arrays;

public class Exercise4 {

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n];

        // Step 1: Assume all numbers from 2 to n-1 are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Step 2: Eliminate non-primes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as not prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        boolean[] arr= sieve(10);
        System.out.println(Arrays.toString(arr));
    }

}
