import java.util.ArrayList;

/**
 * Using Stream
 * @author ashish
 */
public class Stream9 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(18);
        list.add(15);
        list.forEach(n -> {if (n%2 ==0) System.out.println(n);});

    }
}
