public class FloorDecorator extends AbstractDecorator{
  @Override
  public void makeHouse() {
    super.makeHouse();
    // decorating now
    System.out.println("*** Floor decorator is in action ***");
    addFloor();
    // you can out additional stuffs as per your need
  }

  private void addFloor() {
    System.out.println("I am making an additional floor on top of it.");
  }

}
