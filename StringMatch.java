import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Example using Reg Ex
 * @author ashish
 */
public class StringMatch {


     static public void main(String[] args) {

         Pattern pattern= Pattern.compile("test");
         Matcher matcher=pattern.matcher("test 1 test 2");
         while(matcher.find()){
             System.out.println("test found at index "+matcher.start());
         }
    }
}
