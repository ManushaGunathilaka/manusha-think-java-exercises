package questions.map;

import java.util.HashMap;
import java.util.Map;

//1. Create a HashMap and perform basic operations.
public class CreateHashMap {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(2,"Manusha");
        map.put(30,"Kasun");
        map.put(21,"Amila");
        map.put(0,"Sahan");
        map.put(44,"Didula");
        map.put(null,null);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map);
    }


}
