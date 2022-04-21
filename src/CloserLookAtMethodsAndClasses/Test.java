package CloserLookAtMethodsAndClasses;

// Objects may be passed to methods.
class Test {
  
  int a; // default access
  public int b; // public access
  private int c; // private access

  public Test() {
  }
  
  Test (int i) {
    a = i;
  }
  
  Test(int i, int j) {
    a = i;
    b = j;
  }
  
  // Methods to access c
  void setc(int i) { // set c's value
    c = i;
  }
  
  int getc() { // get c's value
    return c;
  }

  // return true if o is equal to the invoking object
  boolean equalTo(Test o) {
    if (o.a == a && o.b == b) {
      return true;
    } else {
      return false;
    }
  }

  // Primitive types are passed by value.
  void meth(int i, int j) {
    i *= 2;
    j /= 2;
  }
  
  // pass an object
  void meth(Test o) {
    o.a *= 2;
    o.b /= 2;
  }
  
  // Returning an object.
  Test incrByTen() {
    System.out.println("Debug 1 a : " + a);
    Test temp = new Test(a + 10);
    return temp;
  }
  
  // Chaining method
  Test incrByHundred(Test t) {
    t.a += 100;
    System.out.println("t.a : " + t.a);
    Test temp = new Test(a + t.a);
    System.out.println("temp.a : " + temp.a);
    return temp;
  }

}
