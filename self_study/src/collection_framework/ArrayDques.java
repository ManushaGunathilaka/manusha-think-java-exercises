package collection_framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDques {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

//        deque.add(7);
//        deque.add(6);
//        deque.add(3);
//        deque.add(4);
//        deque.add(5);

        deque.add(3);
        deque.addLast(4);
        deque.addFirst(2);
        deque.offerFirst(1);
        deque.pollLast();

        System.out.println(deque);
    }
}
