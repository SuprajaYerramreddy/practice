interface Shape {
 double calculateArea() ;
	double calculatePerimeter();
}
class Circle implements Shape{
	int radius=3;
  public double calculateArea() {
	  return Math.PI * radius * radius;
  }
  public double calculatePerimeter() {
	  return 2 * Math.PI * radius;
  }
}
class Rectangle implements Shape{
	int width=4;
	int length=5;
	public double calculateArea() {
		return width * length;
	}
	public double calculatePerimeter() {
		return 2 * (length+width);
	}
}
class Triangle implements Shape{
	int base=6;
	int height=8;
	int a=10,b=6,c=8;
	public double calculateArea() {
		return 1/2 * base * height;
	}
	public double calculatePerimeter() {
		return a + b + c;
	}
}

	