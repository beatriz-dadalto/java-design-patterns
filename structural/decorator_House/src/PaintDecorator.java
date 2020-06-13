public class PaintDecorator extends AbstractDecorator{
  @Override
  public void makeHouse() {
    super.makeHouse();
    // decorating now
    System.out.println("*** Paint decorator is in action now ***");
    paintTheHouse();
    // you can add additional stuffs as per your need
  }

  private void paintTheHouse() {
    System.out.println("Now I am painting the house.");
  }

}
