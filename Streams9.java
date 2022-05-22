import java.util.*;

/**
 * Example using Streams
 * @author ashish
 */
public class Streams9 {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum=list.stream().reduce(0,Integer::sum);
        System.out.println(sum);

    }
}
