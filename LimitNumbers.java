import java.util.Arrays;
import java.util.List;

public class LimitNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,0,1,2,3,1,2,1,2,5,6,7);
        list.stream().filter(n->n%2==0).limit(3).forEach(System.out::println);
    }
}
