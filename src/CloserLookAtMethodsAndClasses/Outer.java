package CloserLookAtMethodsAndClasses;

// Define an inner class within a for loop.
class Outer {

  int outer_x = 100;

  void test() {
    for (int i = 0; i < 10; i++) {
      class Inner {

        int inner_x = 200;
        
        void test() {
          Deepest deepest = new Deepest();
          deepest.display();
        }
        
        void display() {
          System.out.println("display: outer_x = " + outer_x);
        }
        
        class Deepest {

          int deepest_x = 300;

          void display() {
            System.out.println("display: inner_x = " + inner_x);
          }
        }
      }
      Inner inner = new Inner();
      inner.display();
      inner.test();
    }
  }
  
}
