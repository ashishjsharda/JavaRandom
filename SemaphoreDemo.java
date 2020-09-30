package CompleteReference;

import java.util.concurrent.Semaphore;

class Shared{
    static int count=0;
}

class MyThread extends Thread{
    Semaphore semaphore;
    String thread;
    public MyThread(Semaphore semaphore,String name){
        this.semaphore=semaphore;
        this.thread=name;
    }

    @Override
    public void run(){
        System.out.println("Name of thread is "+thread);
        try {
            if (this.thread.equalsIgnoreCase("first")){
                System.out.println(" Thread " + thread + " is waiting to acquire");
                semaphore.acquire();
                Thread.sleep(2000);
                Shared.count++;
                System.out.println("Releasing Thread " +thread +" Count now is  " +Shared.count);
            }

           else if (this.thread.equalsIgnoreCase("second")){
                System.out.println(" Thread " + thread + " is waiting to acquire");
                semaphore.acquire();
                Thread.sleep(2000);
                Shared.count--;
                System.out.println("Releasing Thread "+thread + " Count now is  " +Shared.count);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }
}
public class SemaphoreDemo {

    public static void main(String[] args) throws InterruptedException {

        Semaphore semaphore=new Semaphore(1);
        MyThread thread1=new MyThread(semaphore,"first");
        MyThread thread2=new MyThread(semaphore,"second");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Value of shared count is "+Shared.count);
    }
}
