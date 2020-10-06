import java.util.concurrent.CountDownLatch;
/**
 * Demo using CountDown Latch
 * @author ashish
 */
public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(5);
        System.out.println("Starting");
        new Thread(new MyThread(countDownLatch)).start();
        try{
            countDownLatch.await();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("End");
    }
    static class MyThread implements Runnable{

        CountDownLatch latch;
        MyThread(CountDownLatch latch)
        {
            this.latch=latch;
        }

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            for (int i=0;i<5;i++){
                System.out.println(i);
                latch.countDown();
            }

        }
    }
}
