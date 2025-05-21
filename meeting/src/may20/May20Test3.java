package may20;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class May20Test3 {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 3, 7, 1, 9, 5};

        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        for (int value: numbers){
            uniqueNumbers.add(value);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(uniqueNumbers);
    }
}
