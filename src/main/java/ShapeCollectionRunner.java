import java.util.ArrayList;

public class ShapeCollectionRunner {

  public static void main(String[] args) {
    ArrayList<Shape> shapeList = new ArrayList<Shape>();
    Rectangle twoByTwo = new Rectangle(2, 2);
    Rectangle threeByFour = new Rectangle(3, 4);
    Circle smallCircle = new Circle(2);
    Square fourByFourByFourByFour = new Square(4);

    shapeList.add(twoByTwo);
    shapeList.add(threeByFour);
    shapeList.add(smallCircle);
    shapeList.add(fourByFourByFourByFour);

    for(Shape shape : shapeList) {
      System.out.println(shape.area());
    }

  }

}
