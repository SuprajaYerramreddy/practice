import java.util.Arrays;
public class ReverseArray {
	/*public static int[] reverseArray(int[] arr) {
		if ((arr.length==0) || (arr==null))
			return null;
		int len=arr.length;
		int temp;
		for (int i=0;i<(len/2);i++) {
			temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;			
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int[] arr= {5,3,4,2,1,8,6,7,0};
		int[] rarr=reverseArray(arr);
		
		if (rarr!=null)
			System.out.println("Max value in array is : "+Arrays.toString(rarr));
		else
			System.out.println("please give valid Array");
		*/
		public static void rev(int[] arr) {
			
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println(" ");
				for(int i=arr.length-1;i>=0;i--) {
					System.out.print(arr[i]+" ");
				
			}
		}
	public static void main(String[] args) {
		int[] arr= {3,13,23,33,43};
		rev(arr);
           /*System.out.println(" the original array");
           for(int i=0;i<arr.length;i++) {
        	   System.out.print(arr[i]+" ");
           }
           System.out.println();
           System.out.println(" the reverse array");
           for(int i=arr.length-1;i>=0;i--) {
        	   System.out.print(arr[i]+" ");
	}*/

}
}