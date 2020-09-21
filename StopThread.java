public class StopThread {

    private static boolean stopThread;

    public static synchronized void setStopThread(boolean stopThread) {
        StopThread.stopThread = stopThread;
    }

    public static synchronized boolean isStopThread() {
        return stopThread;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(()->{
            int i=0;
            while (!isStopThread()){
                i++;
            }
        });
        thread.start();
        Thread.sleep(100);
        setStopThread(true);
    }
}
