package CompleteReference;
interface intStack{
    /**
     * Push items in Stack
     * @param item
     */
    void push(int item);

    /**
     * Pop item from stack
     * @return int
     */
    int pop();
}
public class StackDemo implements intStack{
    int stack[];
    int tos;
    public StackDemo(int size)
    {
        stack=new int[size];
        tos=-1;
    }
    /**
     * Push items in Stack
     *
     * @param item
     */
    @Override
    public void push(int item) {
        if(tos==stack.length-1)
        {
            System.out.println("Stack is full");
        }
        stack[++tos]=item;

    }

    /**
     * Pop item from stack
     *
     * @return int
     */
    @Override
    public int pop() {
        if(tos<0)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return stack[tos--];
    }

    public static void main(String[] args) {
        StackDemo demo=new StackDemo(5);
        demo.push(10);
        demo.push(20);
        demo.push(30);
        demo.push(40);
        demo.push(50);
        for(int i:demo.stack)
        {
            System.out.println("Item popped is"+demo.pop());
        }

    }
}
