package userFuncsImp.binaryFuncsImp;

import userFuncs.binaryFuncs.BinaryFunc;

// AbsPlus provides a concrete implementation of
// BinaryFunc. It returns the result of abs(a) + abs(b).
public class AbsPlus implements BinaryFunc {
  
  // Return name of this function.
  public String getName() {
    return "absPlus";
  }
  
  // Implement the AbsPlus function.
  public int func(int a, int b) {
    return Math.abs(a) + Math.abs(b);
  }
}
