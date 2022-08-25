package Generics;

public class GenMathDemo {
  static <T, V> boolean isIn(T x, V[] y) {
    for (int i = 0; i < y.length; i++) {
      if (x.equals(y[i]))
        return true;
    }
    
    return false;
  }
  
  public static void main(String[] args) {
    Integer x = 100;
    Integer[] y = { 1, 2, 3, 4, 5, 100};
    
    System.out.println("Is x in y : " + GenMathDemo.<Integer, Integer>isIn(x, y));
  
    String[] z = { "1", "2", "3", "100"};
    System.out.println("Is x in z : " + isIn(x, z));
  }
}
