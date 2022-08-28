package LambdaExpressions;

public class EmployeeLambda implements Comparable<EmployeeLambda> {

  private long id;
  private String name;
  private String address;
  private double salary;

  public EmployeeLambda(long id, String name, String address, double salary) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.salary = salary;
  }
  
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public int compareTo(EmployeeLambda e) {
    return  Double.compare(this.salary, e.salary);
  }
}
