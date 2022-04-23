package Inheritance;

public class Eating {
  public static void main(String[] args) {
    var p = new Person();
    var a = new Adult();
    var b = new Baby();
    Person x;
    
    x = b;
    x.eating();
    
    x = a;
    x.eating();
    
    x = p;
    x.eating();
    
  }
}
