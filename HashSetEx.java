import java.util.HashSet;
/**
 * Using HashSet
 * @author ashish
 */
public class HashSetEx {
    public static void main(String[] args) {

        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(10);
        hashSet.add(1);
        hashSet.add(7);
        for(var h:hashSet){
            System.out.println(h);
        }
    }
}
