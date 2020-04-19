import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * SequentialStream Demo
 * @author ashish
 */
public class SequentialStreamDemo {

    /**
     * Convert Iterator to Sequential Stream
     * @param iterator
     * @param <T>
     * @return Stream<T>
     */
    public static<T> Stream<T> iteratorToSequentialStream(Iterator iterator){
        Spliterator<T> spliterator= Spliterators.spliteratorUnknownSize(iterator,Spliterator.NONNULL);
        return StreamSupport.stream(spliterator,false);
    }
    public static void main(String[] args) {

        Iterator<String> iterator= Arrays.asList("Mike","John","Vicky").iterator();
        Stream<String> stream=iteratorToSequentialStream(iterator);
        System.out.println("Sequential Stream   "+stream.collect(Collectors.toList()));
    }
}
