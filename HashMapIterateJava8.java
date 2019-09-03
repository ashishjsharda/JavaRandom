package Java12;
import java.util.HashMap;

/**
 * Using Iterators Java 8
 * @author asharda
 *
 */
public class HashMapIterateJava8 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Sai", 100);
		hm.put("Sainath", 200);
		hm.forEach((k,v)->System.out.println("Key seen is " +k +"  Value seen is "+v));

	}

}
