package proxy_protection;
/*
 * the client is talking to a RealSubject instance
 * through a proxy method
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("*** PROXY PATTERN ***");

    // admin is an authorized user
    Proxy proxy = new Proxy("Admin");
    proxy.doSomeWork();

    // Bia is an unauthorized user
    Proxy proxy1 = new Proxy("Bia");
    proxy1.doSomeWork();
  }

}
