import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Example using Executor Service
 * @author ashish
 */
public class ExecutorService2 {
    public static void main(String[] args) {

      ExecutorService executorService= Executors.newSingleThreadExecutor();
      executorService.submit(() -> {
          String thread=Thread.currentThread().getName();
          System.out.println("Hello " +thread);
      });

        try {
            System.out.println("Shutting down executor");
            executorService.shutdownNow();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        finally{
            if(!executorService.isTerminated()){
                System.out.println("Attempt to shutdown executor");
                executorService.shutdown();

            }
        }
    }
}
