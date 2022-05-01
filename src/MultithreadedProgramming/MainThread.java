package MultithreadedProgramming;

public class MainThread {
  public static void main(String[] args) {
    Thread t = Thread.currentThread();
    
    System.out.println("Name          : " + t.getName());
    System.out.println("Id            : " + t.getId());
    System.out.println("Priority      : " + t.getPriority());
    System.out.println("State         : " + t.getState());
    System.out.println("Thread Group  : " + t.getThreadGroup());
    
    SimpleThread t1 = new SimpleThread(300);
    SimpleThread t2 = new SimpleThread(200);
    SimpleThread t3 = new SimpleThread(100);
    
    t1.t.start();
    t2.t.start();
    t3.t.start();
  }
}
