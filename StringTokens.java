/**
 * Generate Random String Tokens
 * @author ashish
 */
public class StringTokens {

    public static void main(String[] args) {
        String string="This is a sample test string";
        String[] tokens=string.split(" ");
        for (String token:tokens ) {
            System.out.println(token);
        }
    }
}
