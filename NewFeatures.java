package Streams;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * New Java 8 Features
 * @author asharda
 *
 */
interface MathOperation
{
	int operation(int a,int b);
}
public class NewFeatures {

	public static void main(String[] args) {
		
		NewFeatures f=new NewFeatures();
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered=strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
		filtered.forEach(System.out::println);
		Random rand=new Random();
		rand.ints().limit(10).sorted().forEach(System.out::println);
		List<Integer> numbers=Arrays.asList(3,2,2,4,5,8);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		MathOperation add=(int a,int b) ->a+b;
		System.out.println(add.operation(5, 10));
		MathOperation sub=(int a,int b) ->a-b;
		System.out.println(sub.operation(15, 10));
		MathOperation mul=(int a,int b) ->a*b;
		System.out.println(mul.operation(15, 10));
	}

}
