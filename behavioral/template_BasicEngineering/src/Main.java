public class Main {

  public static void main(String[] args) {
    System.out.println("** TEMPLATE METHOD PATTERN **\n");

    BasicEngineering preferredCourse = new ComputerScience();
    System.out.println("Computer Sc. course will be completed in following order: ");
    preferredCourse.completeCourse();
    System.out.println();

    preferredCourse = new Electronics();
    System.out.println("Electronics course will be completed in following order:");
    preferredCourse.completeCourse();
  }
}
