import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *Example using LocalDateTime
 * @author ashish
 */
public class LocalDateTimeEx {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.of(2019,5,4,7,0));
        System.out.println(LocalTime.parse("07:15"));
        System.out.println(LocalDate.of(2019,5,4));

    }
}
