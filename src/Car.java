package start;

 class Engine {
 int horsepowwer=7865;
 String fueltype="diesel";
 public void start() {
	 System.out.println("start the engine");
 }
 public void stop() {
	 System.out.println("stop the engine");
 }
}
class Car{
	Engine e;
	Car(Engine e){
		this.e=e;
	}
	public void start() {
		e.start();
		System.out.println("car started");
	}
	public void stop() {
		e.stop();
		System.out.println();
	}
	public static void main(String[] args) {
		Engine e=new Engine();
		Car c=new Car(e);
		c.start();
		c.stop();
	}
}