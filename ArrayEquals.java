import java.util.Arrays;

/**
 * Using ArrayEquals
 * @author ashis 
 */
public class ArrayEquals {
    public static void main(String[] args) {
        int []arr1=new int[30];
        int []arr2=new int[30];
        //Compares references
        System.out.println(arr1.equals(arr2));
        //Compares contents
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
