package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterWords {

    public static ArrayList<String> filterLongWords(ArrayList<String> words){

        ArrayList<String> output = new ArrayList<>();
        for (int i=0; i<words.size();i++){
            if(words.get(i).length()>4){
                output.add(words.get(i));
            }
        }

        return output;
    }

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("cat", "elephant", "dog", "tiger", "bear", "lion"));

        System.out.println(filterLongWords(words));
    }
}
