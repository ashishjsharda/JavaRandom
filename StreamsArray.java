import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Add Array of Numbers using Streams
 * @author ashish
 */
public class StreamsArray {
    public static void main(String[] args) {

        int num[]={10,5,18,21};
        int sum= Arrays.stream(num).sum();
        System.out.println(sum);
    }
}
