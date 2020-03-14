
package ds;

/**
 * Implement Stack in Java
 * @author ashis
 *
 */
public class Stack {

	int []arr=new int[10];
	int top;
	Stack(){
		top=-1;
	}
	
	public void push(int data)
	{
		if(top==arr.length-1)
		{
			System.out.println("Stack is Full");
		}
		arr[++top]=data;
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		
		return arr[top--];
	}
	
	public static void main(String[] args) {
	
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.pop());
	}

}
