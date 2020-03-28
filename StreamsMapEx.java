import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Example using Stream
 * @author ashish
 */
public class StreamsMapEx {

    public static void main(String[] args) {
        List<String> alist=Arrays.asList("Reflection","Collection","Stream","Richard");
        List<String> blist=alist.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
        blist.forEach(System.out::println);
    }
}
