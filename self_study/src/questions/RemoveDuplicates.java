package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 3, 7, 1, 9, 5};
        System.out.println(Arrays.toString(numbers));

        Set<Integer> unique = new HashSet<>();

        for (int n: numbers){
            unique.add(n);
        }

        System.out.println(unique);

    }
}
