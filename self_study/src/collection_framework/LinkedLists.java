package collection_framework;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Graphs");
        list.add("Orange");

        System.out.println(list);
        System.out.println(list.get(4));

    }
}
