import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 *Example using Collections 
 * @author ashish
 */
public class ListEx6 {
    public static void main(String[] args) {

        Set<Integer> set= Collections.emptySet();
        List<String> list=Collections.emptyList();
        List<Integer> list1=Collections.nCopies(20,0);//returns an immutable list that contains specified num of copies of specified object
        list.add("Sai");//Cannot do this.This will throw an Unsupported Exceptions
        for (String s:list) {
            System.out.println(s);

        }

        }

}
