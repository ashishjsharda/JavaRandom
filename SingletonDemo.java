
package test;

/**
 * Singleton Demo
 * @author ashish
 *
 */

class Singleton{
	
	private static Singleton object =new Singleton();
	private Singleton()	{	}
	
	/**
	 * Get Instance
	 * @return Singleton
	 */
	public static Singleton getInstance()
	{
		return object;
	}
	
	/**
	 * Say Hello
	 * @return String
	 */
	public String sayHello()
	{
		return "Hello";
	}
}
public class SingletonDemo {


	public static void main(String[] args) {
		
		System.out.println(Singleton.getInstance().sayHello());
	
	}

}
