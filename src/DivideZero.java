import java.util.Scanner;
public class DivideZero {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.print("Enter First integer");
			int a=scanner.nextInt();
			System.out.print("Enter second integer ");
			int b=scanner.nextInt();
			int result=a/b;
			System.out.println("Result:"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by 0");
		}
	}
}
