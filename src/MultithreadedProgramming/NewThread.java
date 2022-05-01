package MultithreadedProgramming;

// Suspending and resuming a thread the modern way.
class NewThread implements Runnable {

  String name; // name of thread
  Thread t;
  boolean suspendFlag;

  NewThread() {
    t = new Thread(this, name);
    System.out.println("New thread: " + t);
  }

  NewThread(String threadname) {
    name = threadname;
    t = new Thread(this, name);
    System.out.println("New thread: " + t);
    suspendFlag = false;
  }

  // A factory method that creates and starts a thread. 
  public static NewThread createAndStart() {
    NewThread myThrd = new NewThread("Three");
    myThrd.t.start();
    return myThrd;
  }

  // This is the entry point for thread.
  public void run() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println(name + ": " + i);
        Thread.sleep(1000);
        synchronized (this) {
          while (suspendFlag) {
            wait();
          }
        }
      }
    } catch (InterruptedException e) {
      System.out.println(name + " interrupted.");
    }
    System.out.println(name + " exiting.");
  }

  synchronized void mysuspend() {
    suspendFlag = true;
  }

  synchronized void myresume() {
    suspendFlag = false;
    notify();
  }
}
