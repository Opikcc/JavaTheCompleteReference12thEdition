package IOTryWithResourcesAndOthers;

// Use a BufferedReader to read characters from the console.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRRead {
  public static void main(String[] args) {
    char c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter characters, 'q' to quit.");
    
    try {
      // Read characters
      do {
        c = (char) br.read();
        System.out.println(c);
      } while (c != 'q');
    }
    catch(Exception e) {
      System.out.println("Error Exception.");
    }
  }
}
