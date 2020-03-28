import java.util.Arrays;
import java.util.List;

/**
 * Example using Stream
 * @author ashish
 */
public class StreamsDistinctEx {

    public static void main(String[] args) {
       List<Integer>alist=Arrays.asList(1,1,3,2,3,2,1,2,3);
       alist.stream().distinct().forEach(System.out::println);
    }
}
