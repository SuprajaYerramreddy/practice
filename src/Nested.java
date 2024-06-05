import java.util.Scanner;
public class Nested {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.print("Enter First integer");
			int a=scanner.nextInt();
			System.out.print("Enter second integer ");
			int b=scanner.nextInt();
			int result=a/b;
			System.out.println("Result:"+result);
		try {
			System.out.print("enter the size of an array:");
			int size=scanner.nextInt();
			int[] arr=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter"+ " "+(i+1)+" " +"element");
				arr[i]=scanner.nextInt();
			}	
			//System.out.println(arr[3]);
		System.out.println(arr[10]);
		
	}
    catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("Array index is out of range");
    }
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by 0");
		}
		}

	}


