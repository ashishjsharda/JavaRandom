import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using Stream Example3
 * @author ashish
 */
public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,3,4,5,3,5,6,7);
        List<Integer>filteredList=num.stream().map(i->i*i).distinct().collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }
}
