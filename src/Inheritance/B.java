package Inheritance;

// Create a subclass by extending class A.
public class B extends A {

  int k;

  B() {

  }

  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  void showk() {
    System.out.println("k: " + k);
  }

  void sum() {
    System.out.println("i+j+k: " + (i + j + k));
  }

  // display k – this overrides show() in A
  @java.lang.Override
  void show() {
    super.show(); // this calls A's show()
    System.out.println("k: " + k);
  }
  
  // override callme()
  @java.lang.Override
  void callme() {
    System.out.println("Inside B's callme method");
  }
  
//  void meth() { // ERROR! Can't override.
//    System.out.println("Illegal");
//  }
}
