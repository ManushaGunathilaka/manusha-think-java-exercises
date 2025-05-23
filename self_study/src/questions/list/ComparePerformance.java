package questions.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//6. Compare performance of adding 10000 elements to ArrayList vs LinkedList.
public class ComparePerformance {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) arrayList.add(i);
        long arrayTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) linkedList.add(i);
        long linkedTime = System.nanoTime() - start;

        System.out.println("ArrayList time: " + arrayTime + " ns");
        System.out.println("LinkedList time: " + linkedTime + " ns");
    }
}
