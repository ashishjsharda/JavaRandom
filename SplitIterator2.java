import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 *Example using splitIterator
 * @author ashish
 */
public class SplitIterator2 {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(120);
        arrayList.add(11);
        arrayList.add(1);
        arrayList.add(5);
        Stream<Integer> streams=arrayList.stream();
        Spliterator<Integer> spliterator=streams.spliterator();
        Spliterator<Integer> spliterator2=spliterator.trySplit();
        if(spliterator2!=null)
        {
            spliterator2.forEachRemaining((n)-> System.out.println(n));
        }
        System.out.println("Print from original split iterator");
        spliterator.forEachRemaining((n)-> System.out.println(n));

    }
}
