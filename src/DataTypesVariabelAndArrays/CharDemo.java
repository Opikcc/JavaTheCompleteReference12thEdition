package DataTypesVariabelAndArrays;

// Demonstrate char data type.
public class CharDemo {
  public static void main(String[] args) {
    char ch1, ch2, ch3;
    
    ch1 = 88; // code for X
    ch2 = 'Y';
    ch3 = 60000;
    
    System.out.print("ch1 and ch2: ");
    System.out.println(ch1 + " " + ch2);
    System.out.println("ch3 : " + ch3);
    
    for (int x = 0; x <= 65535; x++) {
      System.out.println("char[" + x + "] : " + (char) x);
    }
  }
}
