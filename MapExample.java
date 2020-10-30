import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Using Maps
 * @author ashish
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("testing",null);
        System.out.println(map.get("testing"));
        map.remove("testing");
        System.out.println(map.get("testing"));
        Map<String,Integer> m= Collections.singletonMap("test",-1);
        m.put("test2",2);//This will result in Unsupported Operation Exception
        System.out.println(m.get("test2"));
    }
}
