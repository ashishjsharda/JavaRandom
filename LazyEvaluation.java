import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *Lazy Evaluation
 * @author ashish
 */
public class LazyEvaluation {
    public static void main(String[] args) {
        String[] billyQuotes = {"For Brutus is an honourable man",
                "Give me your hands if we be friends and Robin shall restore amends",
                "Misery acquaints a man with strange bedfellows"};
        List<String> quotes = Arrays.asList(billyQuotes);
        List<String> words=quotes.stream().flatMap(line -> Stream.of(line.split(" +"))).collect(Collectors.toList());
        System.out.println(words.size());
    }
}
