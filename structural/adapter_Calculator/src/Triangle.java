public class Triangle implements ITriangule{
  public double base;
  public double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public void aboutTriangule() {
    System.out.println("Triangle object with base: " + this.base + " unit and height: " + this.height + " unit.");
  }

  @Override
  public double calculateAreaOfTriangule() {
    return base * height / 2;
  }
}
