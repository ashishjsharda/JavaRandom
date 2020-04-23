import java.util.stream.IntStream;

/**
 * Using Stream Range
 * @author ashish
 */
public class StreamRange {
    public static void main(String[] args) {
        System.out.println("Sum of numbers between 1 to 10 is "+IntStream.range(1,10).sum());
    }
}
