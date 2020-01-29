import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Statistics using Java 8
 * @author ashish
 */
public class Statistics {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,3,4,5,3,5,6,7);
        IntSummaryStatistics stats=num.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("Max number seen is "+stats.getMax());
        System.out.println("Min number seen is "+stats.getMin());
        System.out.println("Avg number seen is "+stats.getAverage());
    }
}
