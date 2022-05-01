package MultithreadedProgramming;

public class Konsumen implements Runnable {
  Thread t;
  Queue q;
  
  Konsumen(Queue q) {
    t = new Thread(this, "Konsumen");
    this.q = q;
  }

  @Override
  public void run() {
    while(true) {
      q.get();
    }
  }
}
