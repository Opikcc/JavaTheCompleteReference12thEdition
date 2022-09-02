package StreamAPI;

import java.util.ArrayList;
import java.util.Optional;

public class StreamCombinerDemo {
  
  public static void main(String[] args) {

    // This is now a list of double values.
    ArrayList<Double> myList = new ArrayList<>( );

    myList.add(1.0);
    myList.add(4.0);
    myList.add(9.0);
    myList.add(16.0);
    
    // Using Sequential Stream
    Optional<Double> productOfSqrRoots = myList.stream()
                                               .reduce((a, b) -> a * Math.sqrt(b));
    System.out.println("Product of square roots : " + productOfSqrRoots.get());
    
    // Using Parallel Stream
    double productOfSqr = myList.parallelStream()
                                          .reduce(1.0,
                                                  (a, b) -> a * Math.sqrt(b), // Accumulator
                                                  (a, b) -> a * b); // Combiner
    System.out.println("Product of square roots : " + productOfSqr);
  }
}
