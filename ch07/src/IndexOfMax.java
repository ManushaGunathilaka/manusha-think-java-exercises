public class IndexOfMax {

    public static int indexOfMax(int[] arr){

        int max=0;
        int maxIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,5,8,6,9,7,100};

        int maxIndex= indexOfMax(arr);
        System.out.println(maxIndex);
    }
}
