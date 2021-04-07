public class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return this.length;
  }
  public double getWidth() {
    return this.width;
  }

  public double perimeter() {
    return 2 * length + 2 * width;
  }

  public double area() {
    return length * width;
  }
}