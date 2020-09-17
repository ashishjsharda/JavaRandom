
import java.util.StringTokenizer;

/**
 * Using StringTokenizer
 * @author ashish
 */
public class StringTokenizerTest {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer=new StringTokenizer("This is a sample test");
        while (stringTokenizer.hasMoreTokens())
        {
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
