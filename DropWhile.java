import java.util.stream.Stream;

/**
 * Using DropWhile
 * @author ashish
 */
public class DropWhile {
    public static void main(String[] args) {
        Stream.of("ab","bc","","de","ef").dropWhile(str->!str.isEmpty()).forEach(System.out::println);
    }
}
