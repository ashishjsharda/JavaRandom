import java.util.Arrays;
import java.util.List;

/**
 * Convert Array to List
 * @author ashish
 */
public class AsListDemo {
    public static void main(String[] args) {
        String []str={"John","Michael","Rohan"};
        List<String> list= Arrays.asList(str);
        System.out.println(list.get(0));
    }
}
