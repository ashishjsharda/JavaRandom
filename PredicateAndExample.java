import java.util.function.Predicate;

/**
 * Using Predicates
 * @author ashish
 */
public class PredicateAndExample {
    public static void main(String[] args) {
        Predicate<Integer>lessThan=i->(i<10);
        Predicate<Integer>greaterThan=i->(i>5);
        System.out.println(lessThan.test(12));
        System.out.println(greaterThan.and(lessThan).test(6));
    }
}
