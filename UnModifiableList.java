import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *Example using Unmodifiable List
 * @author ashish
 */
public class UnModifiableList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        for (int i:list){
            System.out.println(i);
        }

        List<Integer> unmodifiableList= Collections.unmodifiableList(list);
        unmodifiableList.add(20);//This would throw UnsupportedOperationException
        for (int i:unmodifiableList){
            System.out.println(i);
        }
    }
}
