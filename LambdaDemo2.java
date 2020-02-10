/**
 * Lambda Expressions Demo 2
 * @author ashish
 */

interface  NumericTest{
    boolean test(int n);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest test=(n)->{
            if(n%2==0){
                return true;
            }
            return false;
        };
        System.out.println("Is the number even  " +test.test(10));
    }
}
