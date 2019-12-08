/**
 * DoubleParams Interface
 * @author asharda
 *
 */


interface DoubleParams
{
	boolean isEven(int num,int d);
}
public class DoubleParamsInterface {

	public static void main(String[] args)  {

		DoubleParams param=(n,d)->{if(n%d==0) {
			return true;
		}else 
			return false;
		};

		System.out.println(param.isEven(10, 2));
		System.out.println(param.isEven(10, 3));
	}
}
