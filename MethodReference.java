import java.util.ArrayList;
import java.util.List;

/**
 * Example using Method Reference
 * @author asharda
 *
 */
public class MethodReference {

	public static void main(String[] args) {

		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.forEach(System.out::println);

	}

}
