import java.util.ArrayList;
import java.util.Spliterator;

/**
 * Using SplitIterator
 * @author asharda
 *
 */
public class SplitIteratorEx {

	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(100);
	list.add(1000);
	list.add(10000);
	Spliterator<Integer> itr=list.spliterator();
	while(itr.tryAdvance(n->System.out.println(n)));

	}

}
