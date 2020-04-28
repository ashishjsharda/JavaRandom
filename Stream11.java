import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Using Streams
 * @author ashish
 */
public class Stream10 {
    public static void main(String[] args) throws IOException {
        Stream<String> rows= Files.lines(Paths.get("data.txt"));
        int rcount=(int)rows.map(x->x.split(",")).filter(x->x.length==3).count();
        System.out.println(rcount);
    }
}
