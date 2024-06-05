
public class MissingNumber {
public static int missing(int[] arr) {
	int n=arr.length+1;
	int expectedsum=n *(n+1)/2;
	int actualsum=0;
	for(int num:arr)
		actualsum+=num;
	return expectedsum-actualsum;
}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7};
		int miss=missing(arr);
		System.out.println("the missing number is:"+miss);
	}

}
