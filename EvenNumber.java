
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Check if a number is an Even Number
 * @author asharda
 *
 */
public class EvenNumber {

	/**
	 * Find if a number is an even integer
	 * @param list
	 * @param pred
	 */
	public static void eval(List<Integer>list,Predicate<Integer> pred)
	{
		for(int i:list)
		{
			if(pred.test(i))
			{
				System.out.println(i + "  "+ " is an even integer");
			}
		}

	}
	public static void main(String[] args) {

		List<Integer>list=Arrays.asList(10,11,18,7,20,28);
		eval(list,n->n%2==0);
	}

}
