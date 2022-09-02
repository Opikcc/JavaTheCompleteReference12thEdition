package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamMapDemo {

  public static void main(String[] args) {
    
    // A list of names, phone numbers, and e-mail addresses.
    ArrayList<NamePhoneEmail> myList = new ArrayList<>( );

    myList.add(new NamePhoneEmail("Larry", "555-5555",
                                  "Larry@HerbSchildt.com"));
    myList.add(new NamePhoneEmail("James", "555-4444",
                                  "James@HerbSchildt.com"));
    myList.add(new NamePhoneEmail("Mary", "555-3333",
                                  "Mary@HerbSchildt.com"));

    System.out.println("Original values in myList: ");
    myList.stream().forEach(
      (n) -> System.out.println(n.name + ", " + n.phone + ", " + n.email));
    System.out.println();
    
    // Map just the name and phone
    Stream<NamePhone> namePhoneStream = myList.stream()
            .filter((n) -> n.name.equals("James"))
            .map((n) -> new NamePhone(n.name, n.phone));
    namePhoneStream.forEach(
      (n) -> System.out.println(n.name + ", " + n.phone));
    System.out.println();
  }
}
