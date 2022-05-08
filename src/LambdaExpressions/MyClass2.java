package LambdaExpressions;

public class MyClass2<T> {
  private T val;
  
  // A constructor that takes an argument.
  MyClass2(T v) {
    val = v;
  }
  
  // This is the default constructor.
  MyClass2() {
    val = null;
  }
  
  T getVal() {
    return val;
  }
}
