package Inheritance;

// A Simple demonstration of abstract.
abstract class D {
  abstract void callme();
  
  // concrete methods are still allowed in abstract classes
  void callmetoo() {
    System.out.println("This is a concrete method.");
  }
}
