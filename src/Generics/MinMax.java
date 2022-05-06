package Generics;

// A Min/Max interface.
public interface MinMax<T extends Comparable<T>> {
  T min();
  T max();
}
