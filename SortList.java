import java.util.Arrays;
import java.util.List;

/**
 * Sort List using Java 8 Stream
 * @author asharda
 *
 */
public class SortList {

	public static void main(String cp[])
	{
		List<Integer> lists = Arrays.asList(10,5,2,3,1,0,9);
		lists.stream().sorted().forEach(System.out::println);
	}

}
