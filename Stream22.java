import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Using Summary Statistics
 * @author ashish
 */
public class Stream22 {
    public static void main(String[] args) {

        IntSummaryStatistics statistics=IntStream.of(10,20,30,40).summaryStatistics();
        System.out.println(statistics);
        System.out.println("Max number is "+statistics.getMax());
        System.out.println("Min number is "+statistics.getMin());
        System.out.println("Average is "+statistics.getAverage());
    }
}
