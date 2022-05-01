package MultithreadedProgramming;

public class MultithreadInnerClass {
  public static void main(String[] args) {
    InnerThread it0 = new InnerThread("First", 1000);
    InnerThread it1 = new InnerThread("Second", 1000);
    InnerThread it2 = new InnerThread("Third", 1000);
    it0.start();
    it1.start();
    it2.start();
    
    System.out.println("Thread First is alive : " + it0.isAlive());
    System.out.println("Thread Second is alive : " + it1.isAlive());
    System.out.println("Thread Third is alive : " + it2.isAlive());
    
    try {
      System.out.println("Waiting for all child thread to finish.");
      it0.join();
      it1.join();
      it2.join();
    
      System.out.println("Thread First is alive : " + it0.isAlive());
      System.out.println("Thread Second is alive : " + it1.isAlive());
      System.out.println("Thread Third is alive : " + it2.isAlive());
    }
    catch(InterruptedException e) {
      System.out.println("Interrupted Exception");
    }
    System.out.println("Exiting Main Thread.");
  }
}
  
class InnerThread extends Thread {
  private int timeSleep;
  private String threadName;
  
  InnerThread(String name, int timeSleep) {
    super("Running Inner Thread " + name);
    this.timeSleep = timeSleep;
    this.threadName = name;
  }

  public void run() {
    Thread t;
    t = currentThread();
    
    if (t.getName().equals("Second")) {
      t.setPriority(MAX_PRIORITY);
    }
    
    try {
      for(int i = 1; i <= 5; i++) {
        System.out.println(t + " : " + i);
        Thread.sleep(timeSleep);
      }
    }
    catch(InterruptedException e) {
      System.out.println("Interrupted Exception");
    }
    System.out.println("Exiting Child Thread.");
  }
}
