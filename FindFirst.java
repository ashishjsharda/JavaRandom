import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Using Stream API
 * 
 * @author asharda
 *
 */
public class FindFirst {

	public static void main(String[] args) {
		Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println);
		IntStream.range(1, 5).forEach(System.out::println);

	}

}
