package ExceptionHandling;

// Demonstrate throw.
class ThrowDemo {

  static void demoproc() {
    try {
      throw new NullPointerException("demo");
    } catch (NullPointerException e) {
      System.out.println("Caught inside demoproc.");
      throw e; // rethrow the exception
    }
  }
  
  static void throwingException() {
    throw new ArithmeticException("Arithmetic Exception Bro!!!");
  }

  public static void main(String[] args) {
    try {
      throwingException();
      demoproc();
    } catch (NullPointerException e) {
      System.out.println("Recaught: " + e);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
  }
}
