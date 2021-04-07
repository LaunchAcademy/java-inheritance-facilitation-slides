public abstract class Shape {
  public abstract double perimeter();

  public abstract double area();

  public void sharedMethod() {
    System.out.println("I'm a shared method amongst all shapes!");
  }
}