/**
 * Using ThreadLocal
 * @author ashish
 */
public class ThreadLocalEx {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal=new ThreadLocal<String>(){
            @Override
            protected String initialValue() {
                return "Hello World";
            }
        };
        System.out.println(threadLocal.get());
    }
}
