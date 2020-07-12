
import java.util.ArrayList;
import java.util.List;

/**
 * Example using synchronized block
 * @author ashish
 */
public class ProductThread {

    String name="";
    List<String> list=new ArrayList<String>();
    public void add(String product)
    {
        //synchronize only those lines of code for which Object state will change
        synchronized (this){
            name=product;
        }
        list.add(name);

    }
    public static void main(String[] args) {
        ProductThread productThread=new ProductThread();
        productThread.add("Lysol");
        System.out.println(productThread.name);

    }
}
