package SetAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetAndHashSet {

    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);

        //Set<Integer> numberSet = new HashSet<>(numberList);
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);
    }
}
