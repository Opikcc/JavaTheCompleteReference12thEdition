package Generics;

// A Generic interface example.

// A Min/Max interface.
public interface MinMax<T extends Comparable<T>> {
  T min();
  T max();
}
