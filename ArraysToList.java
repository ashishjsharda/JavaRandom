import java.util.Arrays;
import java.util.List;

/**
 * Convert Arrays to List
 * @author ashish
 */
public class ArraysToList {
    public static void main(String[] args) {

        String[] str=new String[]{"a","b","c"};
        List<String> s=Arrays.asList(str);
        s.forEach(System.out::println);
        }
    }

