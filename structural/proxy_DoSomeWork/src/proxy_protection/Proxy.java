package proxy_protection;

import java.util.ArrayList;
import java.util.List;

public class Proxy extends Subject{

  static Subject rs;
  String currentUser;
  List<String> registeredUsers;
  // or simply create this mutable list in one step
  // List<String> registeredUsers = new ArrayList<>(Arrays.asList("Admin","Rohit","Sam"));

  public Proxy(String currentUser) {
    // Registered users are Admin, Rohit and Sam only.
    registeredUsers = new ArrayList<>();
    registeredUsers.add("Admin");
    registeredUsers.add("Rohit");
    registeredUsers.add("Sam");
    this.currentUser = currentUser;
  }

  @Override
  public void doSomeWork() {
    System.out.println("\nProxy call happening now...");
    System.out.println(currentUser + " wants to invoke a proxy method.");
    if (registeredUsers.contains(currentUser)) {
      // lazy initialization: we'll not instantiate until the method is called
      if (rs == null) {
        rs = new RealSubject();
      }
      // allow the registered user to invoke the method
      rs.doSomeWork();
    } else {
      System.out.println("Sorry " + currentUser + ", you do not have access rights.");
    }
  }
}
