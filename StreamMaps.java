import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMaps {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Jack", "Lambdas", "In", "Austin");
        List<Integer> wordsLength=words.stream().map(String::length).collect(Collectors.toList());
        wordsLength.forEach(System.out::println);
    }
}
