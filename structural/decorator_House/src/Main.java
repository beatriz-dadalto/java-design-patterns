public class Main {

  public static void main(String[] args) {
    System.out.println("\n*** DECORATOR PATTERN ***\n");

    ConcreteComponent withoutDecorator = new ConcreteComponent();
    withoutDecorator.makeHouse();
    System.out.println("_____________");

    // using a decorator to add floor
    System.out.println("Using a Floor decorator now.\n");

    FloorDecorator floorDecorator = new FloorDecorator();
    floorDecorator.setTheComponent(withoutDecorator);
    floorDecorator.makeHouse();
    System.out.println("_______________");

    // using a decorator to add floor to original house and then paint it
    System.out.println("using a Paint decorator now.\n");

    PaintDecorator paintDecorator = new PaintDecorator();
    // adding results from floor decorator
    paintDecorator.setTheComponent(floorDecorator);
    paintDecorator.makeHouse();
    System.out.println("_______________");
  }
}
