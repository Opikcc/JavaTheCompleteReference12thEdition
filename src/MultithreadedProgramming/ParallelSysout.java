package MultithreadedProgramming;

public class ParallelSysout implements Runnable {
  Thread t;
  private int fromNum;
  private int toNum;

  public ParallelSysout(int from, int to) {
    fromNum = from;
    toNum = to;
    t = new Thread();
  }
  
  @Override
  public void run() {
    System.out.println("fromNum : " + fromNum);
    System.out.println("toNum : " + toNum);
    for(int i = fromNum; i < toNum; i++)
      System.out.println("Loop-"+i);
  }
}
