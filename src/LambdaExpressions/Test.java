package LambdaExpressions;

public class Test {
  public static <T> int checkCall(T t1, T t2, FIface<T> fiFace) {
    // Here Test2::ok is equivalent to t1.ok(t2)
    return fiFace.testMethod(t1, t2);
  }
  
  public static void main(String[] args) {
    checkCall(new Test2("a"), new Test2("b"), Test2::ok);
  }
}
