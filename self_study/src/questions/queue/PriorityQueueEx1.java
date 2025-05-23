package questions.queue;

import java.util.Queue;

//3. Use a PriorityQueue to store integers and observe the order.
public class PriorityQueueEx1 {
    public static void main(String[] args) {

        Queue<Integer> queue = new java.util.PriorityQueue<>();

        queue.offer(30);
        queue.offer(20);
        queue.offer(10);
        queue.offer(25);
        queue.offer(5);

        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
