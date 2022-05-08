package LambdaExpressions;

// An example of capturing a local variable from the enclosing scope.
public class VarCapture {
  static private int x = 1;
  
  public static void main(String[] args) {
    // A local variable that can be captured.
    int num = 10;
    
    MyFunc myLambda = (n) -> {
      // This use of num is OK. It does not modify num.
      int v = num + n;
      
      // However, the following is illegal because it attempts
      // to modify the value of num;
      // num++;
      
      v = VarCapture.x;
      VarCapture.x = 100;
      
      return v;
    };
    
    // The following line would also cause an error, because
    // it would remove the effectively final status from num.
    // num = 9;
    VarCapture.x = 999;
  }
}
