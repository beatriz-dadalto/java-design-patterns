/*
we cannot extend Captain class. The constructor is private
in this case.
 */

public class SingletonPattern {

  public static void main(String[] args) {
    System.out.println("***Singleton Pattern***\n");
    System.out.println("Trying to make a captain for your team: ");

    // constructor is private. we cannot use "new" here
    // Captain captain = new Captain(); // error

    Captain captain1 = Captain.getCaptain();
    System.out.println("Trying to make another captain for your team:");
    Captain captain2 = Captain.getCaptain();
    if (captain1 == captain2)
      System.out.println("captain1 and captain2 are same instance.");
  }
}
