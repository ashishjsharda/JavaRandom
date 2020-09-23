import java.security.SecureRandom;

/**
 * Generate Random numbers using SecureRandom
 * @author ashish
 */
public class RandomIntegers {

    public static void main(String[] args) {
        SecureRandom secureRandom=new SecureRandom();
        System.out.println("Random Numbers generated are");
        secureRandom.ints(10,1,7).forEach(System.out::println);
    }
}
