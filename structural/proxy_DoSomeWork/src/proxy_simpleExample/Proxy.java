package proxy_simpleExample;

public class Proxy extends Subject {

  static Subject rs;

  @Override
  public void doSomeWork() {
    System.out.println("Proxy call happening now...");
    // lazy initialization: we'll not instantiate until the method is called
    if (rs == null) {
      rs = new RealSubject();
    }
    rs.doSomeWork();
  }
}
