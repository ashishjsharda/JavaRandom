
import java.util.ArrayList;

/**
 * Example using Lambda Expression
 * @author ashish
 */

public class Lambda8 {
    public static void main(String[] args) {
        ArrayList<Integer>alist=new ArrayList<Integer>();
        alist.add(10);
        alist.add(20);
        alist.add(30);
        alist.forEach((n) -> System.out.println(n));
        System.out.println("Print all even numbers");
        alist.forEach((n)->{
            if (n%2==0)
            {
                System.out.println(n);
            }
        });

       
    }
}
