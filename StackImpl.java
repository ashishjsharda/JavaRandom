
/**
 * Implement Stack in Java
 * @author asharda
 *
 */
public class StackImpl {

	int items[];
	int top;


	public StackImpl()
	{
		top=-1;
		items=new int[10];

	}

	public void push(int data)
	{
		if(top==items.length)
		{
			System.out.println("Stack is full");
		}
		items[++top]=data;
	}

	public int pop()
	{
		return items[top--];
	}



	public static void main(String[] args) {

		StackImpl stack=new StackImpl();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.pop());
	}

}
