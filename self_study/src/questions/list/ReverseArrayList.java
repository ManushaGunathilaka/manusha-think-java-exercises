package questions.list;

import java.util.*;

//5. Find and return duplicates in a List of integers.
public class ReverseArrayList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1,1,2,3,4,4,5,6,6,7,8));
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for (int num : numbers){
            if(!set1.add(num)){
                set2.add(num);
            }
        }

        System.out.println(numbers);
        System.out.println(set1);
        System.out.println(set2);
    }
}
