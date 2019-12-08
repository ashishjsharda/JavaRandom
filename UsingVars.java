import java.util.List;

/**
 * Using vars
 * @author asharda
 *
 */



public class UsingVars {

	public static void main(String[] args)  {

		var numbers=List.of(1,2,3,4,5);
		for(var num:numbers)
		{
			System.out.println(num);
		}
	}
}
