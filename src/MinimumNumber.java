public class MinimumNumber {
public static int minimum(int[] arr) {
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) 
			min=arr[i];
	}
	return min;
}
	public static void main(String[] args) {
		int[] arr= {80,22,33,42,13,15,26,7,23,1,3};
		int mini=minimum(arr);
		System.out.println("the minimum number is:"+mini);

	}

}
