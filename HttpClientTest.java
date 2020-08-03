import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Example using HttpClient
 * @author ashish
 */
public class HttpClientTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        var request= HttpRequest.newBuilder(URI.create("https://www.nytimes.com/")).GET().build();
        var client= HttpClient.newHttpClient();
        HttpResponse<String> httpResponse=client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());

    }
}
