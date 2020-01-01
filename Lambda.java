/**
 * Math Operation Interface
 */
interface   MathOperation{
    public int operate(int a,int b);
}

interface  Hello{
    public String display();
}
/**
 * Example using Lambda
 * @author  ashish
 */
public class Lambda {
    public static void main(String[] args) {

        MathOperation add=(int a,int b)->a+b;
        System.out.println(add.operate(10,20));
        Hello hello=()->"Hello World";
        System.out.println(hello.display());
    }
}
