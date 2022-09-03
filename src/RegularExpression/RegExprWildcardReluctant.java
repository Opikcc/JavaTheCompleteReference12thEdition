package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Use a reluctant quantifier.
public class RegExprWildcardReluctant {

  public static void main(String[] args) {
    
    Pattern pat;
    Matcher mat;
    
    // Use reluctant matching behavior.
    pat = Pattern.compile("e.+?d");
    mat = pat.matcher("extend cup end table");
    
    while (mat.find())
      System.out.println("Match : " + mat.group());
  }
  
}
