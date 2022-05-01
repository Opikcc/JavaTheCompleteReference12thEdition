package MultithreadedProgramming;

public class ControlMainThread {
  public static void main(String[] args) {
    Thread t = Thread.currentThread();
    
    System.out.println(t);
    System.out.println("Thread Name Before : " + t.getName());
    System.out.println("Thread Priority Before : " + t.getPriority());
    t.setName("Current Thread");
    t.setPriority(Thread.MAX_PRIORITY);
    System.out.println(t);
    System.out.println("Thread Name After : " + t.getName());
    System.out.println("Thread Priority After : " + t.getPriority());
    
    try {
      for(int n = 0; n < 5; n++) {
        Thread.sleep(1000);
        System.out.println(n);
      }
    }
    catch(InterruptedException e) {
      System.out.println("Interrupted Exception");
    }
  }
}
