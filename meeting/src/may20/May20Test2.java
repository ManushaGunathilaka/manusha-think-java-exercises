package may20;

import java.util.ArrayList;
import java.util.Arrays;

public class May20Test2 {

    public static void main(String[] args) {

        int[] arr = {5,5,1,2,1,3,2,4,8,7,7};

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int value: arr){
            if(!uniqueList.contains(value)){
                uniqueList.add(value);
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(uniqueList);
    }
}
