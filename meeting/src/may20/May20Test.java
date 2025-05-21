package may20;

import java.util.ArrayList;

public class May20Test {

    public static void main(String[] args) {

        int[] arr = {5,5,2,6,8,8};
        //int[] temp = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();

        int count=0;

        for(int i=0; i<arr.length; i++){
            boolean isMorethanOne= false;
            for (int j=0; j<i;j++){
                if(arr[i]==arr[j]){
                    isMorethanOne=true;
                    break;
                }
            }
            if(!isMorethanOne){
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}
