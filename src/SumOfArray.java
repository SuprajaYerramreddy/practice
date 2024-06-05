//import java.util.Scanner;
public class SumOfArray {
	public static Integer sumOfElements(int[] arr) {
		//if ((arr.length==0) || (arr==null))
		//	return null;
		int sum=0;
		for (int i:arr) {
			sum+=i;
		}
		 
		
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {3,1,2,4,23,4,3,5,3,2,5,4,52};
		Integer sum=sumOfElements(arr);
		//if (sum!=null)
			System.out.println("Max value in array is : "+sum);
		//else
		//System.out.println("please give valid Array");		
	}
}


/*public static Integer SumOfArry(int[] arr) {
int sum=0;
for(int i=0;i<arr.length;i++) {
	sum+=arr[i];
}
return sum;
}

public static void main(String[] args) {
int[] arr= {2,4,3,5,6,9};
Integer sum=SumOfArry(arr);
System.out.println("the sum of array is:"+sum);
}*/


/*Scanner scanner=new Scanner(System.in);
int sum=0;
	System.out.println("size of an array:");int size=scanner.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++) 
	{
		System.out.println("Enter the"+" "+(i+1)+" "+"elemnt");
		arr[i]=scanner.nextInt();
		sum+=arr[i];
		
	}
	System.out.println("the sum of the array:"+" "+sum);
}
}*/
