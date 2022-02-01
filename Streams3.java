import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List result = names.stream().filter(s ->s.startsWith("S")).collect(Collectors.toList());
        result.forEach(System.out::println);
        
    }
}
