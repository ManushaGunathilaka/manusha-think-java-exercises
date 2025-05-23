package questions.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCreate {
    public static void main(String[] args) {

        Map<String,Integer> treeMap  = new TreeMap<>();
        treeMap.put("Charlie", 2);
        treeMap.put("Alice", 4);
        treeMap.put("Bob", 2);
        treeMap.put(null,null);

        System.out.println(treeMap);

    }
}
