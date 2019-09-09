package Java12;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Implement Custom Comparator
 * @author asharda
 *
 */

public class MyComp implements Comparator<Integer> {

	public static void main(String[] args) {

		TreeSet<Integer> ts=new TreeSet<Integer>(new MyComp()); 
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);

		for(int s:ts)
		{
			System.out.println(s);
		}

	}

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}

	
}
