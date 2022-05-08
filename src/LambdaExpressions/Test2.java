package LambdaExpressions;

public class Test2 {
  
  private String str;
  
  Test2(String str) {
    this.str = str;
  }
  
  int ok(Test2 test2) {
    System.out.println("Current String : " + this.str); // Refer to t1
    System.out.println("Test String : " + test2.str); // Refer to t2
    return 0;
  }
}
