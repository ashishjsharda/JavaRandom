
/**
 * Using Chained Exception
 * @author ashish
 */
public class ChainedException {
    //Method 1
    public static void method1() throws Exception {
        try{
            method2();
        }

        catch (Exception exception){
            throw new Exception("Exception in method 1",exception);
        }
    }

    //Method 2
    public static void method2() throws Exception {
        try{
            method3();
        }
        catch (Exception exception){
            throw new Exception("Exception in method 2",exception);
        }
    }

    //Method 3
    public static void method3() throws Exception {
        throw new Exception("Exception in method 3");
    }
    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

