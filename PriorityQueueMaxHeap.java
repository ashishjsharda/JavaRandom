import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Priority Queue using Max Heap
 * @author ashish
 */
public class PriorityQueueMaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>(Collections.reverseOrder());
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(3);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.contains(10));
    }
}
