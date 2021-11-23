import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,5,1,7,2);
        List<Integer> uniqueNumbers=numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        uniqueNumbers.forEach(System.out::println);
    }
}
