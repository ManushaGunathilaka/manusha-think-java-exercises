package searching;

public class BinarySearchInt {

    private static int binarySeacrh(int[] arr, int left, int right, int n){


        while (left<right){
            int mid = (left+right)/2;
            if(arr[mid]==n){
                return mid;
            }
            if(arr[mid]<n){
                left=mid+1;
            }
            if(arr[mid]>n){
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,5,8,9,4};

        int left = 0;
        int right = arr.length-1;
        int num = 1;

        int index = binarySeacrh(arr,left,right,num);

        if(index>=0){
            System.out.println("number "+arr[index]+" found in array in index : "+index);
        }else {
            System.out.println("number not found in array");
        }



    }
}
