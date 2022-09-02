package StreamAPI;

import java.util.ArrayList;
import java.util.Optional;

public class StreamReduceDemo {
  
  public static void main(String[] args) {
    
    // Create a list of Integer values.
    
    ArrayList<Integer> intList = new ArrayList<>();
    
    intList.add(1);
    intList.add(2);
    intList.add(3);
    
    // Two ways to obtain the integer product of the elements
    // in myList by use of reduce().
    Optional<Integer> productObj = intList.stream().reduce((a, b) -> a * b);
    if (productObj.isPresent())
      System.out.println("Product as Optional : " + productObj.get());
    
    int product = intList.stream().reduce(1, (a, b) -> a * b);
    System.out.println("Product as int : " + product);
  }
}
