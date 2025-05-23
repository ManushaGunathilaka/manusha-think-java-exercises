package questions.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Create a list and add 5 integers to it. Print the list.
public class CreateList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                1,2,3,4,5,6,7
        ));

        System.out.println(numbers);

        for (int num: numbers){
            System.out.print(num+" ");
        }

        System.out.println();

        for (int i =0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
        }

    }

}
