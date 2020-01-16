import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**Using Streams Java 8
 * @author ashish
 *
 */
public class UsingStreams {

	public static void main(String[] args) {

		List<String> alist=Arrays.asList("Sai","Sainath","SaiBaba"," ","");
		List<String> filteredList=alist.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		filteredList.forEach(System.out::println);
	}

}
