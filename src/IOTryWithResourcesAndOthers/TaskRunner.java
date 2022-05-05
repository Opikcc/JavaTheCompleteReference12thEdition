package IOTryWithResourcesAndOthers;

public class TaskRunner {

  private static int number;
  private static boolean ready;

  private static class Reader extends Thread {

    @Override
    public void run() {
      int x = 0;
      while (!ready) {
        Thread.yield();
        System.out.println("Counter " + x++);
      }

      System.out.println(number);
    }
  }

  public static void main(String[] args) {
    new Reader().start();
    number = 42;
    ready = true;
  }
}
