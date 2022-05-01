package MultithreadedProgramming;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainSysOut {
  public static void main(String[] args) {
//    int x = 0;
//    int y = 0;
//    do {
//      System.out.println("x : " + x);
//      System.out.println("y : " + y);
//      ParallelSysout s = new ParallelSysout(x, y);
//      s.t.start();
//      x = y;
//      y += 10000;
//    } while (x < 100000);
    ParallelSysout s1 = new ParallelSysout(0, 10000);
    ParallelSysout s2 = new ParallelSysout(10000, 20000);
    ParallelSysout s3 = new ParallelSysout(20000, 30000);
    ParallelSysout s4 = new ParallelSysout(30000, 40000);
    ParallelSysout s5 = new ParallelSysout(40000, 50000);
    
    s1.t.start();
    s2.t.start();
    s3.t.start();
    s4.t.start();
    s5.t.start();
    
    try {
      s1.t.join();
      s2.t.join();
      s3.t.join();
      s4.t.join();
      s5.t.join();
    } catch (InterruptedException ex) {
      Logger.getLogger(MainSysOut.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
