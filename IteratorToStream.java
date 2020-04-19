import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Convert Iterator to Stream
 * @author ashish
 */
public class IteratorToStream {

    /**
     * Convert iterator to Stream
     * @param iterator
     * @return Stream
     */
    public static Stream convertIteratorToStream(Iterator iterator)
    {
        Spliterator spliterator = Spliterators.spliteratorUnknownSize(iterator, 0);
        return StreamSupport.stream(spliterator,false);
    }
    public static void main(String[] args) {

        Iterator iterator= Arrays.asList(1,2,3,4,5).iterator();
        convertIteratorToStream(iterator).forEach(s-> System.out.println(s));
    }
}
