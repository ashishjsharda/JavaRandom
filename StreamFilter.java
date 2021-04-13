import java.util.Arrays;
import java.util.List;

/**
 * Using Streams
 * @author ashish
 */
public class StreamFilter {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a1","a3","c3","c1");
        list.stream().filter(s->s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
