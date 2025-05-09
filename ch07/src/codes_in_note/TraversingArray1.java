package codes_in_note;

import java.util.Arrays;

public class TraversingArray1 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            a[i] *= a[i];
        }

        System.out.println(Arrays.toString(a));

    }
}
