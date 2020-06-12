import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee{
  // private static int employeeCount = 0;
  private int employeeCount = 0;

  private String name;
  private String dept;
  // The container for child objects
  private List<IEmployee> controls;

  // constructor
  public CompositeEmployee(String name, String dept) {
    this.name = name;
    this.dept = dept;
    controls = new ArrayList<IEmployee>();
  }

  public void addEmployee(IEmployee employee) {
    controls.add(employee);
  }

  public void removeEmployee(IEmployee employee) {
    controls.remove(employee);
  }

  @Override
  public void printStructures() {
    System.out.println("\t" + this.name + " works in " + this.dept);
    for (IEmployee employee : controls) {
      employee.printStructures();
    }
  }

  @Override
  public int getEmployeeCount() {
    employeeCount = controls.size();
    for (IEmployee employee : controls) {
      employeeCount += employee.getEmployeeCount();
    }
    return employeeCount;
  }

}
