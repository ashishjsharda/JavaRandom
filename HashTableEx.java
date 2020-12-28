import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Example using HashTable
 * @author ashish
 */
public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<String, Integer> h = new Hashtable();
        h.put("Apple",0);
        h.put("Orange",1);
        System.out.println(h.get("Orange"));
        Enumeration fruit=h.keys();
        String str;
        while (fruit.hasMoreElements()){
            str= (String) fruit.nextElement();
            System.out.println(h.get(str));
        }
    }
}
