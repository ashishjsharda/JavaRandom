import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Stream From Text
 * @author ashish
 */
public class StreamFromText {
    public static void main(String[] args) throws IOException {

        Stream<String> bands= Files.lines(Paths.get("band.txt"));
        bands.sorted().filter(x->x.length()>12).forEach(System.out::println);
        bands.close();
    }
}
