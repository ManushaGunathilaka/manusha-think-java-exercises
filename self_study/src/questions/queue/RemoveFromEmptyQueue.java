package questions.queue;

import java.util.LinkedList;
import java.util.Queue;

//2. What happens if you use remove() on an empty queue?
public class RemoveFromEmptyQueue {
    public static void main(String[] args) {

        Queue<String > queue = new LinkedList<>();

        // queue.remove(); // Throws NoSuchElementException
    }
}
