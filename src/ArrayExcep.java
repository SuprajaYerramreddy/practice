import java.util.Scanner;
public class ArrayExcep {
    public static void main(String[] args) {
		//int arr[]= {12,33,42,56,77};
    	Scanner scanner=new Scanner(System.in);
    	
		try {
			//System.out.println(arr[10]);
			System.out.print("enter the size of an array:");
			int size=scanner.nextInt();
			int[] arr=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter"+ " "+(i+1)+" " +"element");
				arr[i]=scanner.nextInt();
			
			}	
				System.out.println(arr[3]);
			System.out.println(arr[10]);
			
		}
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Array index is out of range");
        }
    	
	}

}
