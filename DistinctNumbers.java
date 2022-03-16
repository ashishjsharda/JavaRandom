import java.util.Arrays;
import java.util.List;

public class DistinctNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,1,2,1,2,5,6,7);
        list.stream().filter(n->n%2==0).distinct().forEach(System.out::println);
    }
}
