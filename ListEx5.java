import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *Example using Collections 
 * @author ashish
 */
public class ListEx5 {
    public static void main(String[] args) {

        List<Integer> list=List.of(1,5,2,7,3);
        int max=Collections.max(list);
        int min=Collections.min(list);
        System.out.println("Max number in list is "+max);
        System.out.println("Min number in list is "+min);
        List<Integer>list1=new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        Collections.reverse(list1);
        for (int i:list1
             ) {
            System.out.println(i);

        }

        }

}
