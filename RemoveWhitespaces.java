/**
 * Remove whitespaces from a string
 * @author ashish
 */
public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str="Henry is a good guy.";
        System.out.println(str.replaceAll("\\s",""));
    }
}
