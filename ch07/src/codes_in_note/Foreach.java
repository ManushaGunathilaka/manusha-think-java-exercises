package codes_in_note;

import java.util.Arrays;
import java.util.Scanner;

public class Foreach {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i =0; i<arr.length; i++){
            System.out.print("Enter a value");
            arr[i] = in.nextInt();
        }

        for (int value: arr){
            System.out.print(value+" ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(arr));



    }

}
