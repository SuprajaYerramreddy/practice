import java.util.Arrays;
public class SecondLargest {
   public static void SecondLargestElements(int[] arr) {
	   int size=arr.length;
//	   if(size<2) {
 //  System.out.println("invalid input");
//		   return;
//	  }
	   Arrays.sort(arr);
   for(int i=size-2;i>=0;i--) {
	   if(arr[i]!=arr[size-1]) {
		   System.out.println("Second largest element:"+arr[i]);
		   return;
	   }
   }
   System.out.println("there is no second largest number");
   }
   
	public static void main(String[] args) {
		int[] arr= {2,34,12,45,44,68,66,23};
		SecondLargestElements(arr);
	}

		

}
