import java.util.stream.IntStream;
/**
 * Using Streams
 * @author ashish
 */
public class StreamExample1 {
    public static void main(String[] args) {

        IntStream.range(1,10).skip(3).forEach(x->System.out.println(x));
    }
}
