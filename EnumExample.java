/**
 * Example using Enum
 * @author ashish
 */
public class EnumExample {
    enum color{red,orange,green};
    public static void main(String[] args) {

        for(color color:color.values()){
            System.out.println(color);
        }
    }
}
