import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * Example using Comparators
 * @author ashish
 */
public class SortUsingComparators {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(3,2,1,6,8,5);
        numbers.sort(Comparator.naturalOrder());
        numbers.forEach(System.out::println);

    }
}
