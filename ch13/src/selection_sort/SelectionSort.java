package selection_sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void selectionSort(int[] arr){

        for (int i=0; i< arr.length-1; i++){
            int minIndex=i;

            for (int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    public static void main(String[] args) {

        int[] numbers = new int[10];

        Random random = new Random();

        for (int i=0; i<10; i++){
            numbers[i]=random.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));

        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
