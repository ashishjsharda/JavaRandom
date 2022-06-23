import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Example using Streams
 * @author ashish
 */
public class StreamMinMax {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40,50);
        Optional<Integer> min=numbers.stream().reduce(Integer::min);
        System.out.println(min.get());
        List<Integer> maxNumber= Arrays.asList(10,20,30,40,50);
        System.out.println(maxNumber.stream().reduce(Integer::max).get());

    }
}
