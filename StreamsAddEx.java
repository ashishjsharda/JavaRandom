import java.util.Arrays;
import java.util.List;


/**
 * Example using Streams
 * @author ashish
 */
public class StreamsAddEx {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40,50);
        int sum=numbers.parallelStream().reduce(0,Integer::sum);
        System.out.println(sum);

    }
}
