package IOTryWithResourcesAndOthers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientDemo {

  static private void readFiles() {
    
    try(var fin = new FileInputStream("Test.txt");
        var objIn = new ObjectInputStream(fin)) {
      
      Students students = (Students) objIn.readObject();
      System.out.println("Name : " + students.name + ", Address : " + students.address + ", Age : " + students.age);
    }
    catch(IOException e) {
      System.out.println("Error Reading Files!");
    } catch (ClassNotFoundException ex) {
      System.out.println("Error Files Not Found!");
    }
  }

  static private void writeFiles() {
    
    try(var fout = new FileOutputStream("Test.txt");
        var objOut = new ObjectOutputStream(fout)) {
      var students = new Students("Asep", "Bandung", 15);
      
      objOut.writeObject(students);
      objOut.flush();
    }
    catch(IOException e) {
      System.out.println("Error Writing Files!");
    }
  }
  
  public static void main(String[] args) {
    writeFiles();
    readFiles();
  }
}
