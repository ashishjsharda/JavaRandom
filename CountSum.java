import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingInt;

/**
 * Example using Teeing
 * @author ashish
 */
public class CountSum {
    private final Long count;
    private final Integer sum;

    public CountSum(Long count, Integer sum) {
        this.count = count;
        this.sum = sum;
    }
    public static void main(String[] args) {
        CountSum countsum = Stream.of(2, 11, 1, 5, 7, 8, 12)
                .collect(Collectors.teeing(
                        counting(),
                        summingInt(e -> e),
                        CountSum::new));

      

    }
}
