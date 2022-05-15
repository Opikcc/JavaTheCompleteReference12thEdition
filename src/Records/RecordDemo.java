package Records;

// Declare an employee record. This automatically creates a
// record class with private, final fields called name and idNum,
// and with read-only accessors called name() and idNum().
record Employee(String name, int idNum) {
  
  // Use a canonical constructor to remove any leading and trailing spaces
  // that might be in the name string. This ensures that names are stored
  // in a consistent manner.
  public Employee(String name, int idNum) {
    // Remove any leading and trailing spaces.
    this.name = name.trim();
    this.idNum = idNum;
  }
}

// A simple Record example.
public class RecordDemo {
  public static void main(String[] args) {
    // Create an array of Employee records.
    Employee[] empList = new Employee[4];
    
    // Create a list of employees that uses the Employee record.
    // Notice how each record is constructed. The arguments
    // are automatically assigned to the name and idNum fields in
    // record that is being created.
    empList[0] = new Employee("Doe, John", 1047);
    empList[1] = new Employee("Jones, Robert", 1048);
    empList[2] = new Employee("Smith, Rachel", 1049);
    empList[3] = new Employee("Martin, Dave", 1050);
    
    // Use the record accessors to display names and IDs.
    for(Employee e : empList)
      System.out.println("The employee ID for " + e.name() + " is " + e.idNum());
  }
}
