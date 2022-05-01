package MultithreadedProgramming;

public class ExtendingThreadServices extends Thread {

  public ExtendingThreadServices() {
    super("Extending Thread Services");
    System.out.println("Child Thread : " + this);
  }
  
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
