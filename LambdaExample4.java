

interface NumericalTest{
    public boolean test(int n,int d);
}

/**
 * Using Lambda Expression
 * @author ashish
 */
public class LambdaExample4 {
    public static void main(String[] args) {
        NumericalTest even=(n,d) ->{
            if(n%d==0){
                return true;
            }
            return false;
        };
        System.out.println(even.test(10,2));
        System.out.println(even.test(11,2));
    }
}
