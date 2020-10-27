import java.util.List;

/**
 * Iterate List except first word
 * @author ashish
 */
public class Lists1 {
    public static void main(String[] args) {
        List<String> list=List.of("John","Mary","Ben");
        for (String word:list.subList(1,list.size())){
            System.out.println(word);
        }
    }
}
