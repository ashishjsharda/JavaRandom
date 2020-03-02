
class  MathClass{
    public void printNumbers(int num) throws InterruptedException {
        synchronized (this)
        {
            for(int i=0;i<num;i++){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(300);

            }
        }
    }
}

/**
 * Using Synchronization
 * @author ashish
 */
public class SynchronizationExample {
    public static void main(String[] args) {
        MathClass mathClass=new MathClass();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                try {
                    mathClass.printNumbers(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(runnable,"ONE").start();
        new Thread(runnable,"TWO").start();
    }
}
