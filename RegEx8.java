import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Example using Reg Ex
 * @author ashish
 */
public class RegEx8 {

     static public void main(String[] args) {

         Pattern pattern= Pattern.compile("end.*?");
         Matcher matcher=pattern.matcher("This is an end to end testing");
         String str=matcher.replaceAll("start");
         System.out.println(str);
    }
}
