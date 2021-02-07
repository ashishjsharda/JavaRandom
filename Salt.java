import java.security.SecureRandom;
/**
 * Return a random salt to be used as password
 * @author ashish
 */
public class Salt {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        byte []salt=new byte[16];
        random.nextBytes(salt);
        System.out.println(salt);

    }
}
