package userFuncsImp.binaryFuncsImp;

// This is a provider for the AbsMinus function.

import userFuncs.binaryFuncs.BinFuncProvider;
import userFuncs.binaryFuncs.BinaryFunc;

public class AbsMinusProvider implements BinFuncProvider {
  
  // Provide an AbsMinus object.
  public BinaryFunc get() {
    return new AbsMinus();
  }
}
