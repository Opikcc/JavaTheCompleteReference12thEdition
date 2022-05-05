package IOTryWithResourcesAndOthers;

public class VolatileTest {
//  static int x;
  static volatile int x = 1;
  
  public static void main(String[] args) {
//    for(int i = 1; i < 1000000; i++)
//      System.out.println(i);
    var t1 = new VolatileThread("Thread 1");
    var t2 = new VolatileThread("Thread 2");
    var t3 = new VolatileThread("Thread 3");
    
    t1.start();
    t2.start();
    t3.start();
    
    try {
      t1.join();
      t2.join();
      t3.join();
    }
    catch(Exception e) {
      System.out.println("Thread Error Exception");
    }
  }
}

class VolatileThread extends Thread {
  private Thread t;
  
  VolatileThread(String threadName) {
    t = new Thread(this, threadName);
  }
  
  public void run() {
    do {
      System.out.println(t.getName() + " : " + VolatileTest.x++);
    } while (VolatileTest.x < 1000000);
  }
}
