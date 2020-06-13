public class ConcreteComponent implements IComponent{
  @Override
  public void makeHouse() {
    System.out.println("Original House is complete. It is closed for modification.");
  }
}
