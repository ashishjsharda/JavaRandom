import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Example using CopyonWriteArrayListTest
 * @author ashish
 */
public class CopyonWriteArrayListTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList=new CopyOnWriteArrayList();
        copyOnWriteArrayList.add("Hi");
        copyOnWriteArrayList.add("Hello");
        Iterator itr=copyOnWriteArrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
