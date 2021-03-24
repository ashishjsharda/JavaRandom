import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 *Example using Collections
 * @author ashish
 */
public class Collections7 {

     public static void main(String[] args) {

         Collection<String> c=new HashSet<>();
         Collection<String> d=new ArrayList<>();
         Collection<String> e= Collections.singleton("three");
         c.addAll(d);
         c.add("zero");
         System.out.println(c.isEmpty());
         System.out.println(c.size());
         c.forEach(System.out::println);
    }
}
