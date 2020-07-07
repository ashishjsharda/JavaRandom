package CompleteReference;

/**
 * Check if object is instance of a class
 * @author ashish
 */
class  A
{
    A(){

    }
}
public class InstanceOf extends A {
    public static void main(String[] args) {
        InstanceOf instanceOf=new InstanceOf();
        System.out.println(instanceOf instanceof A);
    }
}
