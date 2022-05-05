package IOTryWithResourcesAndOthers;

import java.io.Serializable;

public class Students implements Serializable {
  String name;
  String address;
  transient int age;

  public Students(String name, String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;
  }
  
}
