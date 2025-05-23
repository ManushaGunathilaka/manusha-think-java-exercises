package questions.queue;

//4. Store custom objects in a PriorityQueue with a comparator.

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Task{
    int priority;
    String name;

    public Task(int priority,String name){
        this.priority=priority;
        this.name=name;
    }

    public String toString() {
        return name + "(" + priority + ")";
    }
}


public class CustomObjectsInPriorityQueue {
    public static void main(String[] args) {

        Task t1 = new Task(0,"Manu");
        Task t2 = new Task(1,"Shan");
        Task t3 = new Task(2,"Hesh");

        PriorityQueue<Task> queue = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));
        queue.offer(t1);
        queue.offer(t3);
        queue.offer(t2);
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
