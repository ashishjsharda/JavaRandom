import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Normalize url
 * @author ashish
 */
public class UrlTut {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {

        String URI="https://ashishshardas.wordpress.com/";
        URL url = new URI(URI).normalize().toURL();
        System.out.println(url);
    }
}
