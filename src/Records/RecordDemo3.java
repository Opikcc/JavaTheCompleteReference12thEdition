package Records;

// Declare an employee record that explicitly declares both
// a canonical and non-canonical constructor.
record Employee3(String name, int idNum) {
  
  // Use a static field in a record.
  static int pendingID = -1;
  
  // Use a compact canonical constructor to remove any leading and
  // trailing spaces from the name string.
  public Employee3 {
    // Remove any leading and trailing spaces.
    name = name.trim();
  }
  
  // This is a non-canonical constructor. Notice that it is
  // not passed an ID number. Instead, it passed pendingID to the
  // canonical constructor to create the record.
  public Employee3(String name) {
    this(name, pendingID);
  }
}

// Use a compace canonical constructor to remove any leading
// and trailing spaces in the name component. Also perform
// a basic check that the required format of lastname, firstname
// is passed to the name parameter.

// This version of Employee provides a method called lastName()
// that returns only the last name of the name component.
// It also includes the version of the compact constructor that
// checks for the conventional lastname, firstname format.
record EmployeeCheck(String name, int idNum) {
  public EmployeeCheck {
    // Remove any leading and trailing spaces.
    name = name.trim();
    
    // Perform a minimalist check that name follows the
    // lastname, firstname format.
    //
    // First, confirm that name contains only one comma.
    int i = name.indexOf(','); // look for comma separating names.
    int j = name.lastIndexOf(',');
    if(i != j)
      throw new IllegalArgumentException("Multiple commas found.");
       
    // Next, confirm that a comma is present after
    // at least one leading character, and that at least one
    // character follows the comma.
    if(i < 1 | name.length() == i + 1)
      throw new IllegalArgumentException("Required format: last, first");
  }
  
  // An instance method that returns only the last name
  // without the first name.
  String lastName() {
    return name.substring(0, name.trim().indexOf(','));
  }
}

// Use a non-canonical constructor in a record.
public class RecordDemo3 {
  public static void main(String[] args) {
    Employee3[] empList = new Employee3[4];
    
    // Create a list of employees that uses the Employee record.
    empList[0] = new Employee3("Doe, John", 1047);
    empList[1] = new Employee3("Jones, Robert", 1048);
    empList[2] = new Employee3("Smith, Rachel", 1049);
    
    // Here, the ID number is pending.
    empList[3] = new Employee3("Martin, Dave");
    
    // Display names and IDs.
    for(Employee3 e : empList) {
      System.out.print("The employee ID for " + e.name() + " is ");
      if(e.idNum() == Employee3.pendingID)
        System.out.println("Pending");
      else
        System.out.println(e.idNum());
    }
    
    EmployeeCheck[] empListCheck = new EmployeeCheck[4];
    
    empListCheck[0] = new EmployeeCheck("Doe, John", 1047);
    
    // No comma between last and first name.
    empListCheck[1] = new EmployeeCheck("Jones Robert", 1048);
    
    // Extra commas.
    empListCheck[2] = new EmployeeCheck("Jones, , Robert", 1048);
    
    // Missing last name.
    empListCheck[3] = new EmployeeCheck(", Robert", 1048);
    
    // Display names and IDs.
    for(EmployeeCheck e : empListCheck) {
      System.out.print("The employee ID for " + e.name() + " is ");
      if(e.idNum() == Employee3.pendingID)
        System.out.println("Pending");
      else
        System.out.println(e.idNum());
//      break;
    }
    
    // Display the name component unmodified.
    System.out.println("Employee full name is " + empListCheck[0].name());
    
    // Display only last name.
    System.out.println("Employee last name is " + empListCheck[0].lastName());
  }
}
