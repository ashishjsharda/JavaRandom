import java.util.ArrayList;
import java.util.Optional;

/**
 *Multiply elements of array
 * @author ashish
 */
public class ListMul {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(20);
        arrayList.add(1);
        Optional<Integer> multiple=arrayList.stream().reduce((a, b)->a*b);
        System.out.println(multiple);

    }
}
