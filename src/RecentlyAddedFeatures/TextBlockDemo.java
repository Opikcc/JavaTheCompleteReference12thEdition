package RecentlyAddedFeatures;

// Use double quotes in a text block.
public class TextBlockDemo {

  public static void main(String[] args) {

    String str = """
                 A text block can use double quotes without \n
                 \sthe need for escape sequences. For example: 

                 He said, "The cat is on the roof." \
                 She asked, "How did it get up there?"
                 """;
    
    String record = """
                    records.
                    """;

    System.out.println(str);
    System.out.println(record);
  }
}
