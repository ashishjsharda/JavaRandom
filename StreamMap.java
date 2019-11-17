import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using Streams
 * @author asharda
 *
 */
 
public class StreamMap  {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,2,3,4);
		List<Integer>distinct=nums.stream().map(i->i*i).distinct().collect(Collectors.toList());
		distinct.forEach(System.out::println);
		
		
	}

}
