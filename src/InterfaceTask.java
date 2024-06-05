interface Shap {
 double calculateArea() ;
	double calculatePerimeter();
}
class Circl implements Shap{
	int radius=3;
  public double calculateArea() {
	  return Math.PI * radius * radius;
  }
  public double calculatePerimeter() {
	  return 2 * Math.PI * radius;
  }
}
class Rectangl implements Shap{
	int width=4;
	int length=5;
	public double calculateArea() {
		return width * length;
	}
	public double calculatePerimeter() {
		return 2 * (length+width);
	}
}
class Triangl implements Shap{
	int base=6;
	int height=8;
	int a=10,b=6,c=8;
	public double calculateArea() {
		return (1/2.0)*( base * height);
	}
	public double calculatePerimeter() {
		return a + b + c;
	}
}

public class InterfaceTask      {
		public static void main(String[] args) {
			Circl c=new Circl();
			Rectangl r=new Rectangl();
			Triangl t=new Triangl();
			double ca=c.calculateArea();
			c.calculatePerimeter();
			r.calculateArea();
			r.calculatePerimeter();
			t.calculateArea();
			t.calculatePerimeter();
			System.out.println("area of circle"+c.calculateArea()+"\n perimeter of circle"+c.calculatePerimeter()+"\n area of rectangle"+r.calculateArea()+"\n perimeter of rectangle"+r.calculatePerimeter()+"\n area of triangle"+t.calculateArea()+"\n perimeter of triangle"+t.calculatePerimeter());
		}
		}


	