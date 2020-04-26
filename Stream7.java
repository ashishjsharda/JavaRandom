import java.util.Arrays;

/**
 * Using Streams
 * @author ashish
 */
public class Stream7 {

    public static void main(String[] args) {
        Arrays.asList("Arin","Brad","Chuck","David").stream().map(x->x.toLowerCase()).filter(x->x.startsWith("a")).forEach(System.out::println);
    }
}
