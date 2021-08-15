import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

/**
 * Example using Key Generator
 * @author ashish
 */

public class KGS {
    public static void main(String[] args) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secRandom = new SecureRandom();
        keyGenerator.init(secRandom);
        Key key = keyGenerator.generateKey();
        System.out.println(key);
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(cipher.ENCRYPT_MODE, key);
        String msg = new String("Hi how are you");
        byte[] bytes = cipher.doFinal(msg.getBytes());
        System.out.println(bytes);

    }
}
