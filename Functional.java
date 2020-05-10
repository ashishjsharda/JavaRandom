package Java8;
import java.util.function.Function;

/**
 * Using Functional Interface
 * @author ashish
 */
public class Functional {
    public static void main(String[] args) {
        Function<Integer,Integer> function=integer -> integer*4;
        System.out.println(function.apply(4));
    }
}
