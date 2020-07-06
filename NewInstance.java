package Java12;

/**
 * Create Object using NewInstance
 * @author ashish
 */
public class NewInstance {
    String name="Sai";
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        NewInstance newInstance=NewInstance.class.newInstance();
        System.out.println(newInstance.name);

    }
}
