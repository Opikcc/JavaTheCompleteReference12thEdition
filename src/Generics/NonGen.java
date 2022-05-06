package Generics;

// NonGen is functionally equivalent to Gen
// but does not use generics.
// A non-generic class.
public class NonGen {
  Object ob; // ob is now of type Object
  int num;
  
  // Pass the constructor a reference to
  // an object of type Object
  NonGen(Object o) {
    ob = o;
  }
  
  NonGen(int i) {
    num = i;
  }
  
  // Return type Object.
  Object getOb() {
    return ob;
  }
  
  // Show type of ob.
  void showType() {
    System.out.println("Type of ob is " + ob.getClass().getName());
  }
}
