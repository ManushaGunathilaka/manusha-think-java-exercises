package sorting;

import java.util.Arrays;

public class MergeSort {


    private static void mergeSort(int[] inputArray){

        int inputArrLength = inputArray.length;

        if (inputArrLength<2){
            return;
        }

        int midIndex = inputArrLength/2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputArrLength-midIndex];

        for (int i=0; i<midIndex;i++){
            leftHalf[i]=inputArray[i];
        }
        for (int i=midIndex; i<inputArrLength;i++){
            rightHalf[i-midIndex]= inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray,leftHalf,rightHalf);
    }

    private static void merge(int[] inputArray,int[] leftHalf,int[] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0, j=0,k=0;

        while (i<leftSize && j<rightSize){
            if(leftHalf[i]<rightHalf[j]){
                inputArray[k]=leftHalf[i];
                i++;
            }else {
                inputArray[k]=rightHalf[j];
                j++;
            }
            k++;
        }

        while (i<leftSize){
            inputArray[k]=leftHalf[i];
            i++;
            k++;
        }
        while (j<rightSize){
            inputArray[k]=rightHalf[j];
            j++;
            k++;
        }
    }



    public static void main(String[] args) {

        int[] arr = {56, 23, 10, 20, 14, 48, 36};

        System.out.println("Before: "+ Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("After: "+Arrays.toString(arr));

    }
}
