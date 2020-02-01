import java.util.ArrayList;
import java.util.List;

/**
 * Stream Example 3
 * @author ashish
 */
public class StreamTut {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.stream().forEach(element ->System.out.println(element));
    }
}
