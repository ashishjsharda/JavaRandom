import java.util.ArrayList;
/**
 * Print Sorted List using Stream
 * @author ashish
 */
public class SortedStream {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(17);
        arrayList.add(45);
        arrayList.stream().sorted().forEach((n) -> System.out.println(n));
    }
}
