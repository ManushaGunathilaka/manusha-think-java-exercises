package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(6);
        queue.offer(1);
        queue.offer(5);

        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
