package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// A simple pattern matching demo.
public class RegExpr {

  public static void main(String[] args) {
    
    Pattern pat;
    Matcher mat;
    boolean found;
    
    pat = Pattern.compile("Java");
    mat = pat.matcher("Java");
    found = mat.matches(); // check for a match
    
    System.out.println("Testing Java against Java.");
    if (found)
      System.out.println("Matches");
    else
      System.out.println("No Match");
    
    System.out.println();
    
    System.out.println("Testing Java against Java SE.");
    mat = pat.matcher("Java SE"); // Create a new matcher
    
    found = mat.matches(); // Check for a match
    
    if (found)
      System.out.println("Matches");
    else
      System.out.println("No Match");
  }
  
}
