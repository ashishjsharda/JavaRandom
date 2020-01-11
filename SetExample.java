import java.util.Set;
import java.util.TreeSet;

/**
 * Using TreeSet
 * @author ashish
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("Ashish");
        set.add("Sai");
        set.add("Sneha");
        set.add("AJ");
        set.add("Bubu");
        set.forEach(System.out::println);
    }
}
