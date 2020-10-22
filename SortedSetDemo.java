import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Example using SortedSet
 * @author ashish
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        String []string={"Lion","Elephant","Wolf","Cat","Dog"};
        SortedSet sortedSet=new TreeSet(Arrays.asList(string));
        String first= (String) sortedSet.first();
        String last= (String) sortedSet.last();
        System.out.println(first);
        System.out.println(last);
        //all elements but first
        SortedSet tailSet=sortedSet.tailSet(first+'\0');
        System.out.println(tailSet);

    }
}
