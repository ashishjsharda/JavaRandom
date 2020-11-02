import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Example using Blocking Queue
 * @author ashish
 */
public class FindElement {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list= Arrays.asList(8,1,6,9);
        Collections.sort(list);
        int position=Collections.binarySearch(list,1);
        System.out.println(position);
    }
}
