import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Using Pattern and Matcher
 * @author ashish
 */
public class PatternMatcher {
    public static void main(String[] args) {
        String regex="Tot";
        Pattern pattern=Pattern.compile(regex);
        String codeMatch="Tot";
        Matcher matcher=pattern.matcher(codeMatch);
        System.out.println(matcher.pattern());
        System.out.println(matcher.matches());
    }
}
