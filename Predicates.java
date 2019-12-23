import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Using Predicates
 * @author ashish
 *
 */
public class Predicates {

	public void eval(List<Integer> list,Predicate<Integer> predicate)
	{
		for(int i:list)
		{
			if(predicate.test(i))
			{
				System.out.println(i+ "  is an even number");
			}
		}
	}
	public static void main(String[] args) {

		Predicates p=new Predicates();
		List<Integer> list=Arrays.asList(2,4,5,6,7,10,11,13);
		p.eval(list, n->n%2==0);
	}

}
