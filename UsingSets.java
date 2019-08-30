import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Using Navigable Sets
 * @author asharda
 *
 */
public class UsingSets {

	public static void main(String[] args) {

		NavigableSet n=new TreeSet();
		n.add(10);
		n.add(1);
		n.add(2);
		System.out.println(n.ceiling(0));
		System.out.println(n.floor(12));
		System.out.println("First element seen is "+n.first());


	}

}
