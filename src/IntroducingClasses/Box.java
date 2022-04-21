package IntroducingClasses;

/* Here, Box defines three constructors to initialize
   the dimensions of a box various ways.
*/
class Box {

  double width;
  double height;
  double depth;

  /* Here, Box uses a constructor to initialize the
   dimensions of a box.
  */
  // This is the constructor for Box.
  Box() {
    System.out.println("Constructing Box");
    width = 10;
    height = 10;
    depth = 10;
  }

  /* Here, Box uses a parameterized constructor to
   initialize the dimensions of a box.
  */
  // This is the constructor for Box.
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // compute and return volume
  double volume() {
    return width * height * depth;
  }

  // sets dimensions of box
  void setDim(double w, double h, double d) {
    width = w;
    height = h;
    depth= d;
  }
}
