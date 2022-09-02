package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamIntegerDemo {
  
  public static void main(String[] args) {
    
    List<Integer> intList = new ArrayList<Integer>();
    
    intList.add(-1);
    intList.add(1000);
    intList.add(303);
    intList.add(3);
    intList.add(-1000);
    intList.add(0);
    intList.add(0);
    intList.add(99);
    
    Stream<Integer> intStream = intList.stream();
    
    long start = System.currentTimeMillis();
    // Is intStream == parallelStream
    System.out.println("Is intStream Parallel Stream : " + intStream.isParallel());
    
    // Find minimum value of intStream
    Optional<Integer> minVal = intStream.min(Integer::compare);
    if(minVal.isPresent())
      System.out.println("minval of intStream : " + minVal.get());
    
    // Find maximum value of intStream
    intStream = intList.stream();
    Optional<Integer> maxVal = intStream.max(Integer::compare);
    if(maxVal.isPresent())
      System.out.println("maxVal of intStream : " + maxVal.get());
    
    // Sorting intStream
    // Unordered intStream
    System.out.println("Unordered Stream : ");
    intList.stream().forEach((n) -> System.out.print(n + ", "));
    System.out.println("Ordered Stream : ");
    intList.stream().sorted().forEach((n) -> System.out.print(n + ", "));
    
    // Display Only the odd value
    System.out.println("Display Odd Value : ");
    intStream = intList.stream().sorted().filter((n) -> (n % 2) != 0);
    intStream.forEach((n) -> System.out.print(n + ", "));
    
    System.out.println("");
    
    // Display Only the odd value greater than 5
    System.out.println("Display Odd Value Greater Than 5: ");
    intStream = intList.stream().sorted().filter((n) -> (n % 2) != 0)
                                         .filter((n) -> (n > 5));
    intStream.forEach((n) -> System.out.print(n + ", "));
    
    long end = System.currentTimeMillis();
    
    System.out.println("");
    
    System.out.printf("Total Time %,d : ", (end - start));
  }
  
}
