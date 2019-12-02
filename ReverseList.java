package test;
import java.util.Collections;
import java.util.LinkedList;



/**
 * Reverse Linked List
 * @author asharda
 *
 */
public class ReverseList {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		Collections.sort(list, Collections.reverseOrder());
		list.forEach(System.out::println);
		
	}
}
