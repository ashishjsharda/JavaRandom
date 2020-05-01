import java.io.IOException;
import java.util.stream.Stream;

/**
 * Using Stream Reduce
 * @author ashish
 */
public class Stream15 {
    public static void main(String[] args) throws IOException {

        double total= Stream.of(1.2,6.2,9.5).reduce(0.0,(Double a,Double b) ->a+b);
        System.out.println("Total is " +total);

    }
}
