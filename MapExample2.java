import java.util.Map;

/**
 * Using Maps
 * @author ashish
 */
public class MapExample2 {
    public static void main(String[] args) {
        Map<String,Integer> map=Map.of("Amar",10,"Vijay",20);
        for(Map.Entry entry:map.entrySet()){
            System.out.println("key seen is "+entry.getKey() + "Value seen is "+entry.getValue());
        }

    }
}
