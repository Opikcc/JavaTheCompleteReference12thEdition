module userFuncsImp {
  requires userFuncs;
  
  provides userFuncs.binaryFuncs.BinFuncProvider with
          userFuncsImp.binaryFuncsImp.AbsPlusProvider,
          userFuncsImp.binaryFuncsImp.AbsMinusProvider;
}
