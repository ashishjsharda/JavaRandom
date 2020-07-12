

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Filter if Object is Null
 * @author ashish
 */
public class FilterMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,null);
        map.put(4,"four");
        map.values().removeIf(Objects::isNull);
        map.values().forEach(System.out::println);

    }
}
