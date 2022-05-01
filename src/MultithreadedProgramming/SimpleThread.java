package MultithreadedProgramming;

public class SimpleThread implements Runnable {
  Thread t;
  private static int counter;
  private int threadNum;
  private int timer;
  
  SimpleThread(int timer) {
    this.timer = timer;
    threadNum = ++counter;
    t = new Thread(this, "Simple Thread " + threadNum);
  }

  @Override
  public void run() {
    for(int i = 0; i < 10; i++) {
      try {
        Thread.sleep(0);
        System.out.println("Simple Thread " + threadNum + ", Iterasi ke-" + (i+1));
      } catch (InterruptedException ex) {
        System.out.println(t.getName() + " Interrupted");
      }
    }
  }
  
}
