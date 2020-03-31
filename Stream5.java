import java.util.Arrays;
import java.util.List;

/**
 * Add Even Numbers using Stream
 * @author ashish
 */
public class Stream5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,5,6,3);
        int output=list.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(output);
    }
}
