import java.util.Scanner;
public class Converse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
           System.out.println("Enter the String:");
           String line=scanner.nextLine();
           int number1 = Integer.parseInt(line);
		}
		catch(NumberFormatException e) {
			System.out.println("it is a number format exception");
		}
	}

}
