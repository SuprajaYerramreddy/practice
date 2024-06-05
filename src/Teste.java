class Parent1  {
public void display() {
	System.out.println("display parent");
}
}
class Childe extends Parent1{
	public void display() {
	System.out.println("display fffchild");
}
}
class Teste{
	public static void main(String[] args) {
	Childe c= new Childe();
	c.display();
	Parent1 p= new Parent1();
	p.display();
}
}


