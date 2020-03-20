
import java.util.ArrayList;

/**
 * Example using Lambda Expression
 * @author ashish
 */
interface Test
{

    int add(int a,int b);
}
public class LambdaAdd {
    public static void main(String[] args) {

        Test test=(a,b)->{
            int c=a+b;
            return c;
        };
        System.out.println(test.add(10,20));

    }
}
