import java.util.ArrayList;

/**
 * Using Stream
 * @author ashish
 */
public class Stream10 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList();
        list.add(10);
        list.add(12);
        list.add(15);
        list.forEach(n-> {if(n%3==0) System.out.println(n);});

    }
}
