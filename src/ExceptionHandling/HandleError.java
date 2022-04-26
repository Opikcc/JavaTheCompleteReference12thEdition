package ExceptionHandling;

// Handle an exception and move on.
import java.util.Random;

class HandleError {

  public static void main(String[] args) {
    int a = 0, b = 0, c = 0;
    Random r = new Random();

    for (int i = 0; i < 32000; i++) {
      try {
        b = r.nextInt();
        c = r.nextInt();
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        a = 12345 / (b / c);
      } catch (ArithmeticException e) {
        System.out.println("Division by zero.");
        System.out.println("Exception : " + e);
        a = 0; // set a to zero and continue
      }
      System.out.println("a: " + a);
    }
  }
}
