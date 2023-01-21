import java.util.Arrays;
import java.util.List;

/**
 *
 * Intermediate operations using Streams
 * @author ashish
 */
public class StreamIntermediateOp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().map(i->i+10).forEach(System.out::println);
    }
}
