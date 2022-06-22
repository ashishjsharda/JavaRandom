import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Example using Streams
 * @author ashish
 */
public class StreamsSumEx {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40,50);
        Optional<Integer> sum=numbers.stream().reduce((a, b) ->a+b);
        System.out.println(sum.get());

    }
}
