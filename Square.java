import java.util.Arrays;
import java.util.List;

/**
 * Print Square of a number using Stream
 * @author ashish
 */
public class Square {

    public static void main(String[] args) {
        List<Integer> alist= Arrays.asList(2,3,4,5);
        alist.stream().map(x-> x*x).forEach(x-> System.out.println(x));

    }
}
