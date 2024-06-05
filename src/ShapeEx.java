
abstract class Shape {
	public abstract void draw();
	public abstract double calculateArea();
}
	class Circle extends Shape{
		int radius=3;
		public void draw() {
			System.out.println("Cdraw");
		}
		public double calculateArea() {
			  return Math.PI * radius * radius;
		}
	}
	class Rectangle extends Shape{
		int width=4;
		int length=5;	  
		public void draw() {
			System.out.println("Rdraw");
			}
			public double calculateArea() {
				return width * length;
			}
	}
	class Triangle extends Shape{
		int base=6;
		int height=8;
		
				public void draw() {
					System.out.println("Tdraw");
				}
				
				public double calculateArea() {
					return 1/2 * base * height;
				}
	}
	public class ShapeEx{
		public static void main(String[] args) {
			Circle c=new Circle();
			Rectangle r=new Rectangle();
			Triangle t=new Triangle();
			System.out.println("Area of Circle:"+c.calculateArea());
			System.out.println("Area of Rectangle:"+r.calculateArea());
			System.out.println("Area of Triangle:"+t.calculateArea());
		}
	}
	
	
