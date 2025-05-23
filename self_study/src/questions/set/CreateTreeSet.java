package questions.set;

import java.util.Set;
import java.util.TreeSet;

//2. Check if a TreeSet contains a specific element.
public class CreateTreeSet {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>(Set.of(10, 20, 30, 40));
        System.out.println(treeSet.contains(20));  // true
        System.out.println(treeSet.contains(25));  // false

    }
}
