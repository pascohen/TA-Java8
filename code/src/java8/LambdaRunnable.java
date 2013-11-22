package java8;

public class LambdaRunnable {
  public static void main(String[] args) {
    Runnable r = new Runnable() {
      @Override
      public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
      }
    };
     
    r.run();
    Thread t = new Thread(r);
    t.start();
  }
}
