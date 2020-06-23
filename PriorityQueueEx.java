import java.util.PriorityQueue;

/**
 * Priority Queue
 * @author ashish
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(3);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.contains(10));
    }
}
