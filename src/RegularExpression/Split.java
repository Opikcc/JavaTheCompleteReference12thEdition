package RegularExpression;

import java.util.regex.Pattern;

// Use split().
public class Split {
  
  public static void main(String[] args) {
    
    // Match lowercase words.
    Pattern pat = Pattern.compile("[ ,.!]");
    
    String[] strs = pat.split("one two,alpha0 12!done.");
    
    for (int i = 0; i < strs.length; i++)
      System.out.println("Next token : " + strs[i]);            
  }
}
