
/**
 * Example using Lambdas
 * @author ashish
 */
public class Runnables {
    public static void main(String[] args) {
        Runnable runnable=()-> System.out.println("Hello Lambda");
        new Thread(runnable).start();
    }
}
