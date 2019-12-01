import java.util.Deque;
import java.util.LinkedList;

/**
 * Basic Deque Example
 * @author asharda
 *
 */
public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer> queue=new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.addLast(30);
		queue.addFirst(40);
		queue.removeLast();
		//Print Contents of Queue
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());
		}
	}
}
