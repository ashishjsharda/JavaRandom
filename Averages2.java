import java.util.Arrays;

/**
 * Average using Stream
 * @author ashis
 */
public class Averages2 {
    public static void main(String[] args) {
        Arrays.stream(new int []{2,4,6,8,10}).average().ifPresent(System.out::println);
    }
}
