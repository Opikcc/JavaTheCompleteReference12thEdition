package DataTypesVariabelAndArrays;

// Compute the area of a circle.
public class Area {
  public static void main(String[] args) {
    double pi, r, a;
    
    r = 10.8; // radius of circle
    pi = Math.PI; // pi, approximately
    a = pi * r * r; // compute area
    
    System.out.printf("Area of circle is %.10f %n", a);
  }
}
