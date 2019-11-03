import java.util.Arrays;

/**
 * Using Reduce
 * @author asharda
 *
 */
public class Reduce {

	public static void main(String[] args) {
		int[] array = {23,43,56,97,32};
		Arrays.stream(array).reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));

	}

}
