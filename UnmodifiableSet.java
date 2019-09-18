import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Random Examples
 * @author asharda
 *
 */
public class UnmodifiableSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set=Collections.unmodifiableSet(set);
		System.out.println(set);


	}

}
