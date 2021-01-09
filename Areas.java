abstract class Shape
{
  int dim1,dim2;
  abstract void printArea();
}
class Rectangle extends Shape
{
  public Rectangle(int a, int b)
  {
    dim1 = a;
    dim2 = b;
  }
  void printArea()
  {
    int area = dim1 * dim2;
    System.out.println("Area of rectangle is "+ area);
  }
}
class Triangle extends Shape
{
  public Triangle(int a, int b)
  {
    dim1 = a;
    dim2 = b;
  }
  void printArea()
  {
    double area = (dim1 * dim2)/2.0;
    System.out.println("Area of triangle is "+ area);
  }
}
class Circle extends Shape
{
  public Circle(int a)
  {
    dim1 = a;
  }
  void printArea()
  {
    double area = (22*dim1*dim1)/7.0;
    System.out.println("Area of circle is "+ area);
  }
}
public class Areas
{
  public static void main(String[] args)
  {
    Shape s1 = new Rectangle(5,3);
    Shape s2 = new Triangle(6,3);
    Shape s3 = new Circle(7);
    s1.printArea();
    s2.printArea();
    s3.printArea();
  }
}
