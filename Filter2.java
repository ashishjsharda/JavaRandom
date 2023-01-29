import java.util.stream.Stream;

/**
 *
 * Example using Stream Filter
 * @author ashish
 */
public class Filter2 {
    public static void main(String[] args) {
        Stream.of("apples","oranges","bananas","anana","pears","grapes")
                .filter(s->s.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);

    }
}
