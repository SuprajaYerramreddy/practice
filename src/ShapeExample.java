
public class ShapeExample {
		public static void main(String[] args) {
			Circle c=new Circle();
			Rectangle r=new Rectangle();
			Triangle t=new Triangle();
			double ca=c.calculateArea();
			c.calculatePerimeter();
			r.calculateArea();
			r.calculatePerimeter();
			t.calculateArea();
			t.calculatePerimeter();
			System.out.println("area of circle"+c.calculateArea()+"\n perimeter of circle"+c.calculatePerimeter()+"\n area of rectangle"+r.calculateArea()+"\n area of rectangle"+r.calculatePerimeter()+"\n area of triangle"+t.calculateArea()+"\n area of triangle"+t.calculatePerimeter());
		}
		}

