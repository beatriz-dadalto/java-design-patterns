public final class Captain {

  private static Captain captain;

  // we make the constructor private to prevent the use of "new"
  private Captain() {}

  // synchronized - thread safe
  public static synchronized Captain getCaptain() {
    // Lazy initialization
    if (captain == null) {
      captain = new Captain();
      System.out.println("New captain is elected for your team.");
    } else {
      System.out.println("You already have a captain for your team.");
      System.out.println("Send him for the toss.");
    }
    return captain;
  }

}
