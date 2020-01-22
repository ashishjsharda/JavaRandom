import java.util.function.Predicate;

/**
 * Using Predicates
 * @author ashish
 */
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer>lessThan=i->(i<10);
        System.out.println(lessThan.test(12));
    }
}
