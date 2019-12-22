import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Using For Each Java 8
 * @author ashish
 *
 */
public class Streams {

	public static void main(String[] args) {
	
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		numbers.stream().filter(n-> n%2== 0).forEach(System.out::println);
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Ashish");
		map.put(2, "Sneha");
		map.put(3, "Arjun");
		map.entrySet().forEach(System.out::println);
		
		
		
	}

}
