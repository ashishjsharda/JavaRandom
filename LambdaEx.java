
/**
 * Greeting Interface
 * @author asharda
 *
 */
interface Greeting
{
	public void sayHello(String message);
}

/**
 * Example using Lambda Expression
 * @author asharda
 *
 */
public class LambdaEx {

	public static void main(String[] args) {
	
		Greeting greet=message->System.out.println(message);
		greet.sayHello("Hello Sai");
	}

}
