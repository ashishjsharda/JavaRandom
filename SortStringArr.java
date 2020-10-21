import java.util.Arrays;
import java.util.TreeSet;

/**
 * Sort String Array using TreeSet
 * @author ashish
 */
public class SortStringArr {
    public static void main(String[] args) {
        String[]str= {"Rock","Ash","Mike"};
        TreeSet<String>treeSet= new TreeSet<String>(Arrays.asList(str));
        for (String s :treeSet) {
            System.out.println(s);

        }
    }
}
