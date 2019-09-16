package Java12;

import java.util.Optional;

/**
 * Example using Optional
 * @author asharda
 *
 */
public class UsingOptional {

	public static void main(String[] args) {

		Optional<Integer>a=Optional.ofNullable(null);
		System.out.println(a);
		int c=a.orElse(20);
		System.out.println(c);
		
	}

}
