import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Example using BlockingQueue
 * @author ashis
 *
 */
public class BlockingQueueExample {

	public static void main(String[] args) throws InterruptedException {
	
		BlockingQueue<Integer> queue=new LinkedBlockingQueue<Integer>();
		queue.add(10);
		queue.add(20);
		System.out.println("Items in queue are "+queue);
		System.out.println("Remove items from head" +queue.poll(2, TimeUnit.MILLISECONDS));
		System.out.println("Items in queue are "+queue);

	}

}
