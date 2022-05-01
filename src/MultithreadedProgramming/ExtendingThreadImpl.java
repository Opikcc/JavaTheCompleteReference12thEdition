package MultithreadedProgramming;

public class ExtendingThreadImpl {
  public static void main(String[] args) {
    ExtendingThreadServices ex = new ExtendingThreadServices();
    
    ex.start();

    try {
      for (int i = 5; i > 0; i--) {
        System.out.println("Main Thread: " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted.");
    }
    System.out.println("Main thread exiting");
  }
}
