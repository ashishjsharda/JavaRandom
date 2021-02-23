import java.util.concurrent.ConcurrentHashMap;

/**
 *Example using Concurrent Hash Map
 * @author ashish
 */
public class ConcurrentHashMapEx {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer,String> concurrentHashMap=new ConcurrentHashMap();
        concurrentHashMap.put(100,"John");
        concurrentHashMap.put(102,"Rick");
        concurrentHashMap.put(103,"Tester");
        concurrentHashMap.putIfAbsent(103,"Shalu");
        System.out.println(concurrentHashMap);


    }
}
