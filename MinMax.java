
/**
 * Using Stream API
 * @author ashish
 */

import java.util.ArrayList;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(17);
        arrayList.add(45);
        Optional<Integer> min= arrayList.stream().min(Integer::compare);
        if(min.isPresent())
        {
            System.out.println("Min Element is "+min.get());
        }
        Optional<Integer> max= arrayList.stream().max(Integer::compare);
        if(max.isPresent())
        {
            System.out.println("Max Element is "+max.get());
        }

    }

}
