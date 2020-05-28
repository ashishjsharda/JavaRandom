import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Example using Unmodifiable set
 * @author ashish
 */
public class UnmodifiableSet1 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("Rick");
        set.add("Ram");
        set.add("Ron");
        set= Collections.unmodifiableSet(set);
        System.out.println(set);
    }
}
