package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 17, 18, 19, 24, 27));

        System.out.println(numbers);

        for(int i=0; i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                numbers.remove(i);
            }
        }

        System.out.println(numbers);
    }
}
