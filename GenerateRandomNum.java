import java.util.stream.IntStream;
/**
 *Generate 4 random numbers
 * @author ashish
 */
public class GenerateRandomNum {
    public static void main(String[] args) {

        IntStream intStream=IntStream.generate(()->{
            return (int)(Math.random()*100);
        });
        intStream.limit(4).forEach(System.out::println);
    }
}
