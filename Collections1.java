
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Collections Example
 * @author asharda
 *
 */
public class Collections1 {

	public static void main(String[] args) {
		NavigableSet<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(1);
		set.add(12);
		set.add(29);
		//Print the first element
		int i=(int) set.first();
		System.out.println(i);
		//Print in Descending Order
		Iterator<Integer> itr=set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Print the elements");
		set.forEach(System.out::println);
		
		

	}

}
