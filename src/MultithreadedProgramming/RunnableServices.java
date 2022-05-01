package MultithreadedProgramming;

public class RunnableServices implements Runnable {
  
  Thread t;

  public RunnableServices() {
    t = new Thread(this, "Runnable Services Thread");
    System.out.println("Thread : " + t);
  }
  
  @Override
  public void run() {
    try {
      for(int i = 1; i <= 5; i++) {
        System.out.println("Runnable-" + i);
        Thread.sleep(500);
      }
      System.out.println("Child Thread Exiting.");
    }
    catch(InterruptedException e) {
      System.out.println("Interrupted Exception");
    }
  }
  
}
