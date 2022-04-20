
package IntroducingClasses;

/* A program that uses the Box class.

   Call this file BoxDemo.java
*/
// This class declares an object of type Box.
class BoxDemo {
  public static void main(String[] args) {
    Box mybox = new Box();
    double vol;

    // assign values to mybox's instance variables
    mybox.width = 109.12;
    mybox.height = 208.22;
    mybox.depth = 155.21212;
 
    // compute volume of box 
    vol = mybox.width * mybox.height * mybox.depth;

    System.out.printf("Volume is %,.6f\n", vol);
  }
}
