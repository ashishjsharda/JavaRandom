import java.util.Arrays;

/**
 *Example using Streams
 * @author ashish
 */
public class StringTut {
    public static void main(String[] args) {

        Arrays.asList(1,2,4,5).stream().findFirst().ifPresent(System.out::println);
    }
}
