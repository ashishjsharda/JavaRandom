import java.util.Arrays;
import java.util.List;

public class SkipNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(0,0,1,2,3,1,2,1,2,5,6,7);
        list.stream().distinct().skip(1).forEach(System.out::println);
    }
}
