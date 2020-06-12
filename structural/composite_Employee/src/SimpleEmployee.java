public class SimpleEmployee implements IEmployee{

  private String name;
  private String dept;
  private int employeeCount = 0;

  // constructor
  public SimpleEmployee(String name, String dept) {
    this.name = name;
    this.dept = dept;
  }

  @Override
  public void printStructures() {
    System.out.println("\t\t" + this.name + " works in " + this.dept);
  }

  @Override
  public int getEmployeeCount() {
    return employeeCount;
  }

}
