package proxy_protection;

public class RealSubject extends Subject{
  @Override
  public void doSomeWork() {
    System.out.println("doSomeWork() inside RealSubject is invoked.");
  }

}
