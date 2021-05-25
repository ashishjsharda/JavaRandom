import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Normalization
 * @author ashish
 */
public class Normalization {

    public static String normalize(String input) {
        input=Normalizer.normalize(input, Normalizer.Form.NFKC);
        Pattern pattern= Pattern.compile("[<>]");
        Matcher matcher=pattern.matcher(input);
        if(matcher.find()){
            throw new IllegalArgumentException();
        }
        return input;

    }
    public static void main(String[] args) {
        String input ="\uFE64" +"script" +"\uFE65";
        System.out.println("Unnormalized string is "+input);
        System.out.println("After normalization " +normalize(input));
    }
}
