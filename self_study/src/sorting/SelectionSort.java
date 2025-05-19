package sorting;

import java.util.Arrays;

public class SelectionSort {

    private static void selectionSort(int[] arr) {

        //1. traversal through unsorted array
        //2. find min element from unsorted part
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[min_index]>arr[j]){
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i]= arr[min_index];
            arr[min_index]= temp;
        }

    }

        public static void main (String[]args){

            int[] arr = {56, 23, 10, 20, 14, 48, 36};
            System.out.println("unsorted array: "+ Arrays.toString(arr));

            selectionSort(arr);
            System.out.println("sorted array: "+ Arrays.toString(arr));

        }
}

