import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Example Using Matcher
 * @author ashish
 */
public class PatternEx {
    public static void main(String[] args) {
        String text="A dog is a dog of course";
        String pattern ="dog|course";
        Matcher matcher = Pattern.compile(pattern).matcher(text);
        while (matcher.find())
        {
            System.out.println("Matched "+matcher.group()+ " at position " +matcher.start());
        }
    }
}
