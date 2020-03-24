
/**
 * Find number of objects created
 * @author ashis 
 */
public class CreatedObjects {

    static int numObjects=0;
    {
        numObjects++;
    }

    public CreatedObjects(String str)
    {

    }

    public CreatedObjects(int numObjects)
    {

    }
    public static void main(String[] args) {

        CreatedObjects obj=new CreatedObjects("Hello");
        CreatedObjects obj1=new CreatedObjects(10);
        CreatedObjects obj3;
        System.out.println(numObjects);
    }
}
