import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Example using Reg Ex
 * @author ashish
 */
public class RegularEx2 {

     static public void main(String[] args) {

         Pattern pattern= Pattern.compile("[a-z]+");
         Matcher matcher=pattern.matcher("This is an end to end testing");
         while(matcher.find()){
             System.out.println("Matched "+matcher.group());
         }
    }
}
