import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Example using Try with Resource
 * @author ashish
 * 
 */
public class TryWithResource {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(new File("Switch.java"))) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
