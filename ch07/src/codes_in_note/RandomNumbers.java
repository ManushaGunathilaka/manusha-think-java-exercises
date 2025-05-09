package codes_in_note;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

    public static int[] randomArray(int size){

        Random random = new Random();

        int[] a = new int[size];

        for(int i =0; i<a.length; i++){
            a[i]=random.nextInt(100);
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(randomArray(10)));
    }
}
