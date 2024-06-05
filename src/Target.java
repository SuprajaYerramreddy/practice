public class Target {
	public static void main(String[] args) {
		int[] arr= {32,43,56,74,45};
		int target=56;
		 System.out.println(findIndex(arr, target)); 
	}
		public static int findIndex(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
			return i;
		}     
	}
		  return -1;
	}
}
 