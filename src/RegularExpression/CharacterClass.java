package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClass {
  
  public static void main(String[] args) {
    
    // Match lowercase words.
    Pattern pat = Pattern.compile("[a-z]+");
    Matcher mat = pat.matcher("this is a test.");
    
    while(mat.find())
      System.out.println("Match : " + mat.group());
            
  }
}
