// Module definition for the main application module.
// It now uses BinFuncProvider.
module appStart {
  // Requires the module appfuncs and userfuncs.
  requires appFuncs;
  requires userFuncs;
  
  // appStart now uses BinFuncProvider.
  uses userFuncs.binaryFuncs.BinFuncProvider;
}
