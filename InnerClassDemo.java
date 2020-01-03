/**
 * Demo using Inner Class
 * @author ashish
 *
 */
class Outer
{
	int i;
	public void show()
	{
		i=10;
		Inner inner=new Inner();
		inner.display();
	}
	
	class Inner
	{
		public void display() {
			System.out.println("Value of i seen is "+i);
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
	
		Outer out=new Outer();
		out.show();

	}

}
