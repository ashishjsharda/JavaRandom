import java.util.ArrayList;
import java.util.List;

public class StreamsFilter {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("arvind");
        list.add("ashish");
        list.add("sau");
        list.add("sa");
        list.add("rani");
        long count=list.stream().filter(s->s.length()>3).count();
        System.out.println(count);
    }
}
