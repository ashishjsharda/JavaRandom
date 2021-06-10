import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Example using ListStream
 * @author ashish
 */
public class ListStream {
    public static void main(String[] args) {

        List<String> list=List.of("Amit","","Jack","abc");
        List<String> notEmpty=list.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
        notEmpty.forEach(System.out::println);
    }
}
