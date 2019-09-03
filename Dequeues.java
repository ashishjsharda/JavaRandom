import java.util.Deque;
import java.util.LinkedList;
/**
 * Dequeue in Java
 * @author asharda
 *
 */
public class Dequeues {

	public static void main(String[] args) {

		Deque<Integer> dq=new LinkedList<Integer>();
		dq.add(10);
		dq.add(20);
		System.out.println(dq.getLast());
		System.out.println(dq.getFirst());
		dq.offerFirst(30);
		System.out.println(dq.getFirst());
	}

}
