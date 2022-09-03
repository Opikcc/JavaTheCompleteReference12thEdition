package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Use a quantifier.
public class RegExprQuantifier {

  public static void main(String[] args) {
    
    Pattern pat;
    Matcher mat;
    boolean found;
    
    pat = Pattern.compile("W+");
    mat = pat.matcher("Wxx WW WWW");
    
    while (mat.find())
      System.out.println("Match : " + mat.group());
  }
  
}
