package exercises;

public class Exercise3 {

    public static int indeOfMax(int[] arr){

        int max=0;
        for (int i =0; i< arr.length; i++){
            if(arr[i]>arr[max]){
                max= i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,2,10,4,5};
        System.out.println(indeOfMax(a));
    }
}
