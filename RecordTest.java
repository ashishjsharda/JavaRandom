record Vehicle(int id,String name){}

/**
 * Example using Records
 * @author ashish 
 */
public class RecordTest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle(100,"Toyota");
        System.out.println(vehicle.id());
        System.out.println(vehicle.name());
    }
}
