package RecentlyAddedFeatures;

public class TextBlocks {
  public static void main(String[] args) {
    String str = """
                 Text blocks support strings that
                     span two or more lines and preserve
                         indentation. They reduce the
                             tedium associated with the
                          entry of long or complicated
                     strings into a program.
                 """;
    str = """
          A
            B
          C
    """;
    System.out.println(str);
  }
}
