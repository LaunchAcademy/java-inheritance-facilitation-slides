public class Square extends Rectangle{

    public Square(double length) {
        super(length, length);
    }
    public double area() {
        return getLength() * getLength();
    }
    public double perimeter() {
        return 4 * getLength();
    }
}
