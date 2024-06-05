class Parent  {
public void display() {
	System.out.println("display parent");
}
}
class Child extends Parent{
	public void display() {
	System.out.println("display child");
}
}
class Test{
	public static void main(String[] args) {
	Child c= new Child();
	c.display();
}
}