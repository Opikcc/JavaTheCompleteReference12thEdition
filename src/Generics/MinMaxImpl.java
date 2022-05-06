package Generics;

// Now, implement MinMax
public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
  T[] vals;
  
  MinMaxImpl(T[] o) {
    vals = o;
  }
  
  // Return the minimum value in vals.
  public T min() {
    T v = vals[0];
    
    for(int i = 1; i < vals.length; i++)
      if(vals[i].compareTo(v) < 0) v = vals[i];
    
    return v;
  }
  
  // Return the maximum value in vals.
  public T max() {
    T v = vals[0];
    
    for(int i = 1; i < vals.length; i++)
      if(vals[i].compareTo(v) > 0) v = vals[i];
    
    return v;
  }
}
