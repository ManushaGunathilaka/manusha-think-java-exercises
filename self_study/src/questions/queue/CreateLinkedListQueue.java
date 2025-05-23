package questions.queue;

import java.util.LinkedList;
import java.util.Queue;

//1. Create a queue using LinkedList and perform basic operations (add, poll, peek)
public class CreateLinkedListQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(8);
        queue.offer(9);
        queue.offer(5);
        queue.offer(82);

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        queue.clear();
        System.out.println(queue);
    }
}
