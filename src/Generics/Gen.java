package Generics;

// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
public class Gen<T> {
  T ob; // Declare an object of type T
  
  // Pass the constructor a reference to
  // an object of type T.
  Gen(T o) {
    ob = o;
  }
  
  // Return ob.
  T getOb() {
    return ob;
  }
  
  // Show type of T.
  void showType() {
    System.out.println("Type of T is " + ob.getClass().getName());
  }
}
