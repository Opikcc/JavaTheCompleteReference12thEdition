package TypeWrappersAndAutoboxing;

// Demonstrate a type wrapper.
public class Wrap {
  public static void main(String[] args) {
    Character cOb = Character.valueOf('C');
    
    char c = cOb.charValue();
    
    System.out.println(c + " " + cOb); // Display C C
    
    Integer iOb = Integer.valueOf(100);
    
    int i = iOb.intValue();
    
    System.out.println(i + " " + iOb); // Displays 100 100
  }
}
