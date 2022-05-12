package userFuncsImp.binaryFuncsImp;

// This is a provider for the AbsPlus function.

import userFuncs.binaryFuncs.BinFuncProvider;
import userFuncs.binaryFuncs.BinaryFunc;

public class AbsPlusProvider implements BinFuncProvider {
  
  // Provide an AbsPlus object.
  public BinaryFunc get() {
    return new AbsPlus();
  }
}
