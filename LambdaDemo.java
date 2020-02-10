/**
 * Lambda Expressions Demo
 * @author ashish
 */

interface  MyNumber{
    double getValue();
}
public class LambdaDemo {
    public static void main(String[] args) {

        MyNumber num;
        num=()->128.90;
        System.out.println(num.getValue());
    }
}
