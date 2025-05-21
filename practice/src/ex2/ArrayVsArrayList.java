package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayVsArrayList {

    public static void main(String[] args) {

//        int[] arr = {10, 15, 22, 33, 40};
//
//        for (int value: arr){
//            if (value%2==0){
//                System.out.print(value+" , ");
//            }
//        }

        ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        for (int i=0; i<5;i++){
            System.out.print("Enter a number: ");
            int number = in.nextInt();
            list.add(number);
        }

        for (int value: list){
            if (value%2==0){
                System.out.print(value+" , ");
            }
        }



    }
}
