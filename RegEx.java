/**
 *Example using Regex
 * @author ashish
 */
public class RegEx {
    public static void main(String[] args) {

        String text="Now is the time for all good men to come together";
        String [] words=text.split("\\s");
        for(String word : words)
        {
            System.out.println(word);
        }

    }
}
