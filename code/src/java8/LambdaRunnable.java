package java8;

/**
 * @author Przemyslaw Bielicki
 */
public class LambdaRunnable {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        
        Thread t = new Thread(r);
        t.start();
    }
}
