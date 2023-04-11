import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Using Streams.
 * @author ashish
 */
public class Stream27 {

    public static void main(String[] args) {

       List<String> datasource = new ArrayList<>();
       datasource.add("arvind");
       datasource.add("ashish");
       datasource.add("sau");
       datasource.add("sa");
       datasource.add("rani");
       long count = datasource.stream().filter(s->s.length()>3).count();
       System.out.println(count);


    }
}
