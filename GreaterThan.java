import java.util.Arrays;
import java.util.List;

/**
 * Using Stream API
 * @author asharda
 *
 */
public class GreaterThan {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,2,9,11,10,7);
		long count=list.stream().filter(n->n>10).count();
		System.out.println(count);

	}

}
