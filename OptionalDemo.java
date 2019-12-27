package JDK8;

import java.util.Optional;

/**
 * Using Optional
 * @author ashish
 *
 */
public class OptionalDemo {

	public static void main(String[] args) {
	
		Optional<Integer> optional=Optional.of(10);
		System.out.println(optional.isEmpty());
		System.out.println(optional.get());
		System.out.println(optional.isPresent());
		optional.ifPresent(System.out::println);
		
	}

}
