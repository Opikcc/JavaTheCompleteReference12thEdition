package MultithreadedProgramming;

public class ProdusenKonsumen {
  public static void main(String[] args) {
    Queue q = new Queue();
    Produsen p = new Produsen(q);
    Konsumen k = new Konsumen(q);
    
    p.t.start();
    k.t.start();
  }
}
