import java.text.NumberFormat;
import java.util.Locale;

/**
 *Example using NumberFormat
 * @author ashish
 */
public class NumberFormatEx {
    public static void main(String[] args) {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(fmt.format(100));
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(1000000));
        System.out.println(fmt.format(10000));
  }
}
