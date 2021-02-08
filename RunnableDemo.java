
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Example using Runnable
 * @author ashish
 */
public class RunnableDemo {
    public static void main(String[] args) {

      Runnable hello = ()->{
          for(int i=0;i<=100;i++)
          {
              System.out.println("Hello "+i);
          }
      };

        Runnable goodbye = ()->{
            for(int i=0;i<=100;i++)
            {
                System.out.println("Good Bye "+i);
            }
        };

        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(hello);
        executorService.execute(goodbye);

    }
}
