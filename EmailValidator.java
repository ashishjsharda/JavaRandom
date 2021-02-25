import java.util.regex.Pattern;

/**
 *Email Validator
 * @author ashish
 */
public class EmailValidator {
    public static void main(String[] args) {

        String sample = "ashish12@ashish.com*";
        Boolean validEmail = Pattern.matches("(?i)[^@]+@[^@]+\\.[a-z]+", sample);
        System.out.println(validEmail);

    }
}
