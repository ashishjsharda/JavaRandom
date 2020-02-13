/**
 * Numeric Test interface
 */
interface NumericTest{
    boolean test(int num,int d);
}

/**
 * Using Lambda Expressions -Demo 3
 * @author ashish
 */
public class LambdaDemo3 {
    public static void main(String[] args) {

        NumericTest numericTest=(n,d) ->(n%2==0);
        if(numericTest.test(10,2)){
            System.out.println("Number is an even number");
        }
        else {
            System.out.println("Number is not an even number");
        }
    }
}
