import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Print Even Numbers using Java 8
 * @author asharda
 *
 */
public class Java8Tests {

	public static void eval(List<Integer>n,Predicate<Integer> pr)
	{
		for(int i:n)
		{
			if(pr.test(i))
			{
				System.out.println(i + "");
			}
		}
	}
	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(10,2,7,19,20,81,32);
		System.out.println("Print Even Numbers");
		eval(list,n->n%2==0);
	}

}
