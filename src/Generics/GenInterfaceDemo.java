package Generics;

// A generic interface example.
public class GenInterfaceDemo {
  public static void main(String[] args) {
    Integer[] inums = { 3, 6, 2, 8, 6 };
    Character[] chs = { 'b', 'r', 'p', 'w' };
    
    MinMaxImpl<Integer> iob = new MinMaxImpl<Integer>(inums);
    MinMaxImpl<Character> cob = new MinMaxImpl<Character>(chs);
    
    System.out.println("Max value in inums: " + iob.max());
    System.out.println("Min value in inums: " + iob.min());
    
    System.out.println("Max value in chs: " + cob.max());
    System.out.println("Min value in chs: " + cob.min());
  }
}
