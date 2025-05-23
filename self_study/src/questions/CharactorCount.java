package questions;

import java.util.HashMap;
import java.util.Map;

public class CharactorCount {
    public static void main(String[] args) {

        String word = "banana";

        char[] charArray = word.toCharArray();

        Map<Character,Integer> chaInt = new HashMap<>();

        for (char c: charArray ){
            if(chaInt.containsKey(c)){
                chaInt.put(c,chaInt.get(c)+1);
            }else {
                chaInt.put(c,1);
            }
        }

        System.out.println(chaInt);

        for (char c: chaInt.keySet()){
            System.out.println(c+" = "+chaInt.get(c));
        }
    }
}
