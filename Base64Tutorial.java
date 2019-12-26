import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Base 64 Encoding and Decoding
 * @author ashish
 *
 */
public class Base64Tutorial {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String base64Encoding=Base64.getEncoder().encodeToString("HelloWorld".getBytes("utf-8"));
		System.out.println("Encoded String is"+base64Encoding);
		byte[] base64Decoding=Base64.getDecoder().decode(base64Encoding);
		System.out.println("Decoded String is "+new String(base64Decoding,"utf-8"));
	}

}
