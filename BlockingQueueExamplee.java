import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Example using Blocking Queue
 * @author ashish
 */
public class BlockingQueueExamplee {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue=new ArrayBlockingQueue(10);
        blockingQueue.put(10);
        System.out.println(blockingQueue.take());
    }
}
