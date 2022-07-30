import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * Example using Date 
 * @author ashish
 */
public class DateEx {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023, 5, 26);
        date = date.with(ChronoField.MONTH_OF_YEAR, 9);
        date = date.plusYears(2).minusDays(10);
        date.withYear(2023);
        System.out.println(date);
    }
}
