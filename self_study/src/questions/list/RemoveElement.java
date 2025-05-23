package questions.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//3. Remove an element by index and print the updated list.
public class RemoveElement {
    public static void main(String[] args) {

        List<String> namesArrayList = new ArrayList<>(List.of(
                "Manusha","Kalpa","Deeshana","Sarath"
        ));

        List<String> namesLinkedList = new LinkedList<>(List.of(
                "Manusha","Kalpa","Deeshana","Sarath"
        ));

        System.out.println("ArrayList: "+namesArrayList);
        System.out.println("LinkedList: "+namesLinkedList);

        System.out.println("romove 2nd: "+namesArrayList.remove(1));
        System.out.println("romove 3rd: "+namesLinkedList.remove("Deeshan"));

        System.out.println("ArrayList: "+namesArrayList);
        System.out.println("LinkedList: "+namesLinkedList);
    }
}
