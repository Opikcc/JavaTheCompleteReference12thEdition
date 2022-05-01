package MultithreadedProgramming;

public class Produsen implements Runnable {
  Thread t;
  private Queue q;
  
  Produsen(Queue q) {
    t = new Thread(this, "Produsen");
    this.q = q;
  }

  @Override
  public void run() {
    int i = 0;
    
    while(true) {
      q.put(i++);
    }
  }
  
}
