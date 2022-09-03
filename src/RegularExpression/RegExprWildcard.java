package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Use wildcard and quantifier.
public class RegExprWildcard {

  public static void main(String[] args) {
    
    Pattern pat;
    Matcher mat;
    
    pat = Pattern.compile("e.+d");
    mat = pat.matcher("extend cup end table");
    
    while (mat.find())
      System.out.println("Match : " + mat.group());
  }
  
}
