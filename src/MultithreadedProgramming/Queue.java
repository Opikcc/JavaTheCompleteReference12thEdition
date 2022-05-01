package MultithreadedProgramming;

public class Queue {
  private int queue;
  private boolean valueStats = false;
  
  synchronized public void get() {
    
    while(!valueStats) {
      try {
        wait();
      }
      catch(InterruptedException e) {
        System.out.println("Interrupted Exception.");
      }
    }
    
    System.out.println("Get " + queue);
    valueStats = false;
    notify();
  }
  
  synchronized public void put(int n) {
    
    while(valueStats) {
      try {
        wait();
      }
      catch(InterruptedException e) {
        System.out.println("Interrupted Exception.");
      }
    }
    
    queue = n;
    System.out.println("Put " + queue);
    valueStats = true;
    notify();
  }
  
}
