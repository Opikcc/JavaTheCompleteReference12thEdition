package CloserLookAtMethodsAndClasses;

// Demonstrate variable-length arguments.
public class VarArgs {
  
  // vaTest() now uses a varargs.
  static void vaTest(int ... v) {
    System.out.print("Number of args: " + v.length + " Contents: ");
    
    for(int x : v)
      System.out.print(x + " ");
    
    System.out.println();
  }
  
  public static void main(String[] args) {
    // Notice how vaTest() can be called with a
    // variable number of arguments.
    vaTest(10);       // 1 args
    vaTest(1, 2, 3);  // 3 args
    vaTest();         // no args
  }
}
