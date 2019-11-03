import java.util.Arrays;
import java.util.List;

/**
 * Filter Java Stream
 * @author asharda
 *
 */
public class Filter {

	public static void main(String[] args) {
	
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd"," ", "jkl");
		long count=strings.stream().filter(string->!string.isEmpty()).count();
		System.out.println("Count seen is "+count);

	}

}
