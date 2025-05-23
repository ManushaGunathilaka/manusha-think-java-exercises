package collection_framework;

import java.util.*;

public class PriorityQueues {

    public static void main(String[] args) {

        Queue<Double> prioq = new PriorityQueue<>();

        prioq.offer(45.6);
        prioq.offer(25.6);
        prioq.offer(65.6);
        prioq.offer(95.6);
        prioq.offer(10.6);

        System.out.println(prioq);
//        while (!prioq.isEmpty()){
//            System.out.println(prioq.poll());
//        }

        Iterator<Double> iterator = prioq.iterator();
        while (iterator.hasNext()){
            System.out.println(prioq.poll());
        }

    }
}
