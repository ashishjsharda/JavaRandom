/**
 * Example using Lambda Expressions
 * @author ashish
 */
public class LambdaTest {
    public static void main(String[] args) {

        Hello hello=()->"Greetings";
        System.out.println(hello.greet());
    }
}

interface Hello{
    public String greet();
}
