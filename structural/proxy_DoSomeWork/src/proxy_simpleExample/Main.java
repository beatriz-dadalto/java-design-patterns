package proxy_simpleExample;

/*
 * The client is talking to a proxy_simpleExample.RealSubject instance
 * through a proxy method
 */

public class Main {

  public static void main(String[] args) {
    System.out.println("*** PROXY PATTERN ***\n");
    Proxy proxy = new Proxy();
    proxy.doSomeWork();
  }
}
