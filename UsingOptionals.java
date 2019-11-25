import java.util.Optional;

/**
 * Using Optional
 * @author asharda
 *
 */
public class UsingOptionals {

	public static int sum(int a,Integer b)
	{
		return Optional.ofNullable(a).get()+Optional.ofNullable(b).orElse(0);
	}
	public static void main(String[] args) {
	
		int add=sum(10,null);
		System.out.println(add);
		
	}

}
