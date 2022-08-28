package LambdaExpressions;

public class AnagramImpl {
  
  static Anagram medianTeks() {
    return (String n) -> {
      String result = "";
      if (n.length() > 0) {
        result += n.charAt(n.length() / 2);
      }
      
      return result;
    };
  }
  
  public static void main(String[] args) {
    
    Anagram anagram = (n) -> {
      String result = "";
      if (n.length() > 0) {
        for (int i = n.length(); i > 0 ; i--) {
          result += n.charAt(i-1);
        }
      }
      
      return result;
    };
    
    Anagram anagram2 = medianTeks();
    
    System.out.println("Anagram of Babibubebo is " + anagram.execute("Babibubebo"));
    System.out.println("Median Teks of Babibubebo is " + anagram2.execute("Babibubebo"));
  }
}
