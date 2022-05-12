package userFuncs.binaryFuncs;

// This interface defines the form of a service provider that
// obtains BinaryFunc instances.
public interface BinFuncProvider {
  
  // Obtain a BinaryFunc.
  public BinaryFunc get();
}
