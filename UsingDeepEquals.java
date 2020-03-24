import java.util.Arrays;

/**
 * Using DeepEquals
 * @author ashis 
 */
public class UsingDeepEquals {
    public static void main(String[] args) {
        Object[]b1=new Object[]{'a','b'};
        Object[]b2=new Object[]{'a','b'};
        Object[]b3=new Object[]{'x','y'};
        System.out.println(Arrays.deepEquals(b1,b2));
        //Using Equals
        System.out.println(Arrays.equals(b1,b3));
    }
}
