import java.util.LinkedList;
import java.util.Queue;

/**
 * Basic Queue Example
 * @author asharda
 *
 */
public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		//Print Contents of Queue
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());
		}

		queue.add(10);
		queue.add(20);
		queue.poll();
		System.out.println(queue.peek());

	}

}
