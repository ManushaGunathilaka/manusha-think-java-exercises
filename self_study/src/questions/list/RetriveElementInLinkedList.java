package questions.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// 2.Retrieve and print the 3rd element of a LinkedList.
public class RetriveElementInLinkedList {

    public static void main(String[] args) {

        List<String> fruits = new LinkedList<>(List.of(
                "Apple","Orange","Graphs","Mango"
        ));

        //3rd element
        System.out.println(fruits.get(2));

        for (String word: fruits){
            System.out.println(word);
        }
    }
}
