package questions.set;

import java.util.HashSet;
import java.util.Set;

//1. Create a HashSet, add some elements, and print the set.
public class CreateHashSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println(set);
    }
}
