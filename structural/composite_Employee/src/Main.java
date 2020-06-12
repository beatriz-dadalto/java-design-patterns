public class Main {
  /*
  * Principal is on top of college.
  * HOD - Maths and Comp. SC directly reports to him
  * Teachers of Computer Sc. directly reports to HOD-CSE
  * Teachers of Maths directly reports to HOD-Maths
   */
  public static void main(String[] args) {
    System.out.println("*** COMPOSITE PATTERN ***");
    // 2 TEACHERS OTHERS THAN hod WORKS IN MATHS DEPARTMENT
    IEmployee mathTeacher1 = new SimpleEmployee("Math Teacher-1", "Maths");
    IEmployee mathTeacher2 = new SimpleEmployee("Math Teacher-2", "Maths");

    // teachers other than HOD works in Computer SC. department
    IEmployee cseTeacher1 = new SimpleEmployee("CSE Teacher-1", "Computer Sc.");
    IEmployee cseTeacher2 = new SimpleEmployee("CSE Teacher-2", "Computer Sc.");
    IEmployee cseTeacher3 = new SimpleEmployee("CSE Teacher-3", "Computer Sc.");

    // the college has 2 Head of departments:
    // One from Mathematics,
    // One fromComputer Sc.
    CompositeEmployee hodMaths = new CompositeEmployee("Mrs.S.Das(HOD-Maths)", "Maths");
    CompositeEmployee hodCompSc = new CompositeEmployee("Mr. V.Sarcar(HOD-CSE)", "Computer Sc.");

    // principal of the college
    CompositeEmployee principal = new CompositeEmployee("Dr.S.Som(Principal)", "Planning-Supervising-Managing");

    // teachers of Math directly reports to HOD-Maths
    hodMaths.addEmployee(mathTeacher1);
    hodMaths.addEmployee(mathTeacher2);

    // teachers of Computer Sc. directly reports to HOD-CSE
    hodCompSc.addEmployee(cseTeacher1);
    hodCompSc.addEmployee(cseTeacher2);
    hodCompSc.addEmployee(cseTeacher3);

    // Principal is on top of college. HOD-Maths and Computer Sc.
    // directly reports to him
    principal.addEmployee(hodMaths);
    principal.addEmployee(hodCompSc);

    // printing the leaf-nodes and branches in the same way in each case,
    // we are calling printStructures() method
    System.out.println("\n Testing the structure of a Principal object");

    // prints the complete structure
    principal.printStructures();
    System.out.println(" At present Principal has control over " +
            principal.getEmployeeCount() + " number of employees.");

    System.out.println("\n Testing the structure of a HOD-CSE object:");
    // prints the details of Computer Sc department
    hodCompSc.printStructures();
    System.out.println(" At present HOD-CSE has control over " +
            hodCompSc.getEmployeeCount() + " number of employees.");

    System.out.println("\n Testing the structure of a HOD-Maths object:");
    // prints the details of Mathematics department
    hodMaths.printStructures();
    System.out.println(" At present HOD-Maths has control over " +
            hodMaths.getEmployeeCount() + " number of employees.");

    // Leaf node
    System.out.println("\n Testing the structure of a leaf node:");
    mathTeacher1.printStructures();
    System.out.println(" At present Math Teacher-1 has control over " +
            mathTeacher1.getEmployeeCount() + " number of employees.");

    // suppose, one computer teacher is leaving now from te organization
    hodCompSc.removeEmployee(cseTeacher2);
    System.out.println("\n After CSE Teacher-2 resigned, the organization has following members:");
    principal.printStructures();

    System.out.println(" At present Principal has control over " +
            principal.getEmployeeCount() + " number og employees.");
    System.out.println(" At present HOD-CSE has control over " +
            hodCompSc.getEmployeeCount() + " number of employees.");
    System.out.println(" At present HOD-Maths has control over " +
            hodMaths.getEmployeeCount() + " number of employees.");
  }

}
