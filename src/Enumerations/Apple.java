package Enumerations;

// An enumeration of apple varieties.
// Use an enum constructor, instance variable, and method.
public enum Apple {
  Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8), Manalagi;
  
  private int price; // Price of each apple
  
  // Constructor
  Apple() {
    price = -1;
  }
  
  Apple(int p) {
    price = p;
  }
  
  int getPrice() {
    return price;
  }
}
