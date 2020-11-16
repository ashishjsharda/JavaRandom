
/**
 * Using Regular Expressions
 * @author ashish
 */
public class ValidateName {

    /**
     * Validate name of a user
     * @param name
     * @return boolean
     */
    public static boolean test(String name){
        return name.matches("[A-Z][a-zA-Z]*");
    }
    public static void main(String[] args) {
        System.out.println(test("Ricky"));
        System.out.println(test("Ricky2"));

    }

}
