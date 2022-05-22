import java.util.*;

/**
 * Example using Streams to find max
 * @author ashish
 */
public class Max {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 20, 3, 14, 5, 6, 7, 8, 9);
        Optional<Integer> max=list.stream().reduce(Integer::max);
        System.out.println(max.get());

    }
}
