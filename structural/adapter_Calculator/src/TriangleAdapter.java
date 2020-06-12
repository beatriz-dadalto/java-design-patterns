import javax.swing.plaf.basic.BasicTreeUI;

public class TriangleAdapter implements IRectangle{

  Triangle triangle;

  public TriangleAdapter(Triangle triangle) {
    this.triangle = triangle;
  }

  @Override
  public void aboutRectangle() {
    triangle.aboutTriangule();
  }

  @Override
  public double calculateAreaOfRectangle() {
    return triangle.calculateAreaOfTriangule();
  }
}
