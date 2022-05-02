package Enumerations;

public class EnumDemo {
  public static void main(String[] args) {
    Apple ap;
    
    ap = Apple.RedDel;
    
    // Output an enum value.
    System.out.println("Value of ap: " + ap);
    System.out.println();
    
    ap = Apple.GoldenDel;
    
    // Compare two enum values.
    if(ap == Apple.GoldenDel)
      System.out.println("ap contains GoldenDel.\n");
    
    // Use an enum to control a switch statement.
    switch(ap) {
      case Jonathan:
        System.out.println("Jonathan is red.");
        System.out.println("Price : " + Apple.Jonathan.getPrice());
        break;
      case GoldenDel:
        System.out.println("Golden Delicious is yellow.");
        System.out.println("Price : " + Apple.GoldenDel.getPrice());
        break;
      case RedDel:
        System.out.println("Red Delicious is red.");
        System.out.println("Price : " + Apple.RedDel.getPrice());
        break;
      case Winesap:
        System.out.println("Winesap is red.");
        System.out.println("Price : " + Apple.Winesap.getPrice());
        break;
      case Cortland:
        System.out.println("Cortland is red.");
        System.out.println("Price : " + Apple.Cortland.getPrice());
        break;
    }
  }
}
