import java.util.Arrays;
public class DuplicateNumbers {
	/*public static void dupli(int arr[]) {
		System.out.println("duplicate numbers are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
                 System.out.println(arr[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {2,3,2,4,3,5,5};
		dupli(arr);
	}

}*/
	/*public static void findDuplicates1(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if  (arr[i]==arr[j] ) {
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}
	}*/
	public static void findDuplicates(int[] arr) {
		Arrays.sort(arr);
		int contain=-1;
		for(int i=1;i<arr.length;i++) {
			if  (contain!=arr[i] && arr[i]==arr[i-1] )	 {
				System.out.print(arr[i]+" ");
				contain=arr[i];
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {2,3,2,4,3,5,5,5};
		System.out.println();
		findDuplicates(arr);		
	}

}