
/**
 * Using Generics
 * @author ashish
 */
public class GenericsTest {

    /**
     * Print Array
     * @param inputArray
     * @param <E>
     */
    public static <E> void printArray(E[] inputArray)
    {
        for (E element:inputArray)
        {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {

        Integer[] intArray={10,8,20,17,39};
        Double[] doubleArray={10.0,28.0};
        printArray(intArray);
        printArray(doubleArray);

    }
}
