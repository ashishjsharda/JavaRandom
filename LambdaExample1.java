interface MyNum{
	double getValue();
}
/**
 * Demo using Lambda Expression
 * @author ashish
 *
 */
public class LambdaExample1 {

	public static void main(String[] args) {

		MyNum num;
		num=() -> 258.90;
		System.out.println(num.getValue());

	}

}
