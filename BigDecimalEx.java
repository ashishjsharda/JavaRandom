import java.math.BigDecimal;

/**
 *Example using BigDecimal
 * @author ashish
 */
public class BigDecimalEx {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal( "9223372036854775807" );
        BigDecimal bd2 = new BigDecimal( 9223372036854775807L );
        System.out.println( bd1.add( bd2 ) );
    }
}
