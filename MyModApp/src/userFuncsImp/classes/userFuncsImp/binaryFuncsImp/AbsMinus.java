package userFuncsImp.binaryFuncsImp;

// AbsMinus provides a concrete implementation of

import userFuncs.binaryFuncs.BinaryFunc;

// BinaryFunc. It returns the result of abs(a) - abs(b).
public class AbsMinus implements BinaryFunc {
  
  // Return name of this function.
  public String getName() {
    return "absMinus";
  }
  
  // Implement the AbsMinus function.
  public int func(int a, int b) {
    return Math.abs(a) - Math.abs(b);
  }
}
