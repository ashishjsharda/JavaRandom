import java.util.regex.Pattern;

/**
 * Using Patterns
 * @author ashish
 */
public class Patterns7 {
    public static void main(String[] args) {
        Pattern pattern =Pattern.compile("[,.]");
        String strs[]=pattern.split(" one, two ,three .12.10,18 ");
        for (int i=0;i< strs.length;i++){
            System.out.println(strs[i]);
        }

    }
}
