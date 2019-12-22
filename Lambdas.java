import java.util.Arrays;
import java.util.List;

/**
 * Using Lambda Expression
 * @author ashish
 *
 */
public class Lambdas {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.forEach(p->{
			System.out.println(p);
		});

	}

}
