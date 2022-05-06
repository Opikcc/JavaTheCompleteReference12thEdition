package Generics;

// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number.
public class Stats<T extends Number> {
  T[] nums; // Array of Number or subclass
  
  // Pass the constructor a reference to
  // an array of type Number or subclass.
  Stats(T[] o) {
    nums = o;
  }
  
  // Return type double in all cases.
  double average() {
    double sum = 0.0;
    
    for(int i = 0; i < nums.length; i++)
      sum += nums[i].doubleValue();
    
    return sum / nums.length;
  }
  
  // Determine if two averages are the same.
  boolean isSameAvg(Stats<?> ob) {
    if(average() == ob.average())
      return true;
    
    return false;
  }
}
