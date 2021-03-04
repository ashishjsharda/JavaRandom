import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *Find Min in a List
 * @author ashish
 */
public class ListMin {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(20);
        arrayList.add(1);
        Stream<Integer> stream=arrayList.stream();
        System.out.println(stream.min(Integer::compare));

    }
}
