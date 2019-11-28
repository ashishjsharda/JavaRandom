import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Using SortedSet
 * @author asharda
 *
 */
public class SetsExample {

	public static void main(String[] args) {

		SortedSet<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(3);
		System.out.println(set.first());
		System.out.println(set.last());
		
	}

}
