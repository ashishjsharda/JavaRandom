import java.util.Collections;
import java.util.LinkedList;

/**
 * Rotate a List
 * @author asharda
 *
 */
public class RotateList {

	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		Collections.rotate(list, 1);
		list.forEach(System.out::println);
		
	}

}
