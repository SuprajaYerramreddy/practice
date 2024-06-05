public class Animal {
public void makeSound() {
	System.out.println("sound");
}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("bow-bow");
	}
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("meow-meow");
	}
}
class Cow extends Animal{
	public void makeSound() {
		System.out.println("amba-amba");
	}
}

