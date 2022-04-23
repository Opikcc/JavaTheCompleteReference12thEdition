package Inheritance;

// A Simple example of inheritance.

// Create a superclass.
public class A {
  int i, j;
  
  A(){
    
  }
  
  A(int a, int b) {
    i = a;
    j = b;
  }
  
  void showij() {
    System.out.println("i and j: " + i + " " + j);
  }
  
  // display i and j
  void show() {
    System.out.println("i and j: " + i + " " + j);
  }
  
  // Dynamic Method Dispatch
  void callme() {
    System.out.println("Inside A's callme method");
  }
  
  final void meth() {
    System.out.println("This is a final method.");
  }
}
