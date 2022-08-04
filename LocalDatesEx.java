import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * Example using Local Dates
 * @author ashish
 */
public class LocalDatesEx {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("20220318",
                DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date1);
    }
}
