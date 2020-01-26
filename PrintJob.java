import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Implement Locks
 * @author ashish
 */
class PrintingJob implements Runnable
{
    private PrintJob printerQueue;

    public PrintingJob(PrintJob printerQueue)
    {
        this.printerQueue = printerQueue;
    }

    @Override
    public void run()
    {
        System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
        printerQueue.printJob(new Object());
    }
}
public class PrintJob {
    private final Lock lock=new ReentrantLock();
    public void printJob(Object document)
    {
        lock.lock();
        try{
            Long duration=(long)(Math.random()*10000);
            System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a Job during " + (duration / 1000) + " seconds :: Time - " + new Date());
            Thread.sleep(duration);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Document has been printed"+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {

        PrintJob printJob=new PrintJob();
        Thread thread[] = new Thread[10];
        for (int i = 0; i < 10; i++)
        {
            thread[i] = new Thread(new PrintingJob(printJob), "Thread " + i);
        }
        for (int i = 0; i < 10; i++)
        {
            thread[i].start();
        }
    }
}
