
public class MathUtils {
	    public static int add(int a, int b) {
	        return a + b;
	    }
	    public static int subtract(int a, int b) {
	        return a - b;
	    }
	    public static int multiply(int a, int b) {
	        return a * b;
	    }
	    public static double divide(int a, int b) {
	        return (double) a / b;
	    }
	 	    public static void main(String[] args) {
	        System.out.println("Addition: " + MathUtils.add(3,5));
	        System.out.println("Subtraction: " + MathUtils.subtract(5,6));
	        System.out.println("Multiplication: " + MathUtils.multiply(7,8));
	        System.out.println("Division: " + MathUtils.divide(10,5));
	    }
	}

