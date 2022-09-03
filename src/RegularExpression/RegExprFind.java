package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Use find() to find a subsequence.
public class RegExprFind {

  public static void main(String[] args) {
    
    Pattern pat = Pattern.compile("Java");
    Matcher mat = pat.matcher("Java SE");
    
    System.out.println("Looking for Java in Java SE.");
    if (mat.find())
      System.out.println("subsequence found");
    else
      System.out.println("No Match");
    
    pat = Pattern.compile("test");
    mat = pat.matcher("test 1 2 3 4 test");
    
    while(mat.find()) {
      System.out.println("test found at index " + mat.start());
    }
  }
  
}
