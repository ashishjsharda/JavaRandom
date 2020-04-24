import java.util.stream.Stream;

/**
 * Using Stream Of
 * @author ashish
 */
public class Stream13 {
    public static void main(String[] args) {
        Stream.of("Rick","Annie","Bern","Charles").sorted().findFirst().ifPresent(System.out::println);
    }
}
