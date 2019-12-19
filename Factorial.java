/**
 * Factorial of a program
 * @author asharda
 *
 */
public class Factorial {

	/**
	 * Return factorial of a program
	 * @param num
	 * @return int 
	 */
	public static int fact(int num)
	{
		if(num<0)
		{
			System.out.println("Number cannot be less than 0");
			return -1;
		}
		
		else if(num==1||num==0) return num;
		else
			return fact(num-1)*num;
	}
	public static void main(String[] args) {

		System.out.println(fact(-1));
	}

}
