package Inheritance;

public class C extends A {
  
  public int x;
  
  // override callme()
  @java.lang.Override
  void callme() {
    System.out.println("Inside C's callme method");
  }
}
