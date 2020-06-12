import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("*** ADAPTER PATTERN ***");

    Rectangle rectangle = new Rectangle(20,10);
    System.out.println("Area of rectangle is: " + rectangle.calculateAreaOfRectangle() + " Square unit.");

    Triangle triangle = new Triangle(10,5);
    System.out.println("Area of triangle is: " + triangle.calculateAreaOfTriangule() + " Square unit.");

    IRectangle adapter = new TriangleAdapter(triangle);
    // passing a triangle instead of a rectangle
    System.out.println("Area of triangule using the triangle adapter is: " +
            getArea(adapter) + " Square unit.");

    // some additional code (optional) to show the power of adapter pattern

    List<IRectangle> rectangleObjects = new ArrayList<IRectangle>();
    rectangleObjects.add(rectangle);
    // rectangleObjects.add(triangle); // Error
    rectangleObjects.add(adapter); // Ok
    System.out.println("");
    System.out.println("*** Current objects in the system are: ***");
    for (IRectangle rectObjects : rectangleObjects) {
      rectObjects.aboutRectangle();
    }

  }

  /* getArea(IRectangle r) method does not know that through
   * TriangleAdapter, it is getting a Triangle object instead
   * of a Rectangle object */
  public static double getArea(IRectangle r) {
    return r.calculateAreaOfRectangle();
  }

}
