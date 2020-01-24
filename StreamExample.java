import java.util.stream.IntStream;
/**
 * Using Streams
 * @author ashish
 */
public class StreamExample {
    public static void main(String[] args) {

        IntStream.range(1,10).forEach(System.out::println);
    }
}
