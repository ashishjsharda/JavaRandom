import java.util.Arrays;
import java.util.List;

/**
 * Example using Stream
 * @author ashish
 */
public class Stream19 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("A1","B1","C1","C2");
        list.stream().filter(s -> s.startsWith("C")).sorted().forEach(System.out::println);
    }
}
