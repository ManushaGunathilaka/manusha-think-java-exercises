package as;

import java.util.Arrays;
import java.util.HashMap;

public class Test4 {

    public static void main(String[] args) {

        String word = "banana";

        char[] charArray = word.toCharArray();
        System.out.println(Arrays.toString(charArray));

        HashMap<Character,Integer> charInt = new HashMap<>();

        for (char character: charArray){
            if (charInt.containsKey(character)){
                charInt.put(character,charInt.get(character)+1);
            }else {
                charInt.put(character,1);
            }
        }

        System.out.println(charInt);

        for (char c: charInt.keySet()){
            System.out.println(c +" = "+charInt.get(c));
        }

    }
}
