package test;

/**
 * Hello World using Lambda
 * @author asharda
 *
 */

//Hello Interface
interface Hello
{
	String helloWorld();
}

public class HelloWorldLambda {

	public static void main(String[] args)  {

		Hello h= () ->"Hello World";
		System.out.println(h.helloWorld());
		
	}
}
