import java.util.Arrays;
public class Remove {
    public static int[] rem(int[] arr,int val) {
    	int count=0;
    	for(int i:arr) {
    		if(i==val) {
    			count++;
    		}
    	}
    	int[] result=new int[arr.length-count];
    		int j=0;
    		for(int i:arr) {
    		if(i!=val) {
    			result[j++]=i;
    		}
    	}
		return result;
    }
	public static void main(String[] args) {
		int[] arr= {2,4,3,56,4,3,6,7,4,5,4,6,7};
		System.out.println(Arrays.toString(arr));
		int val=4;
		int[] result = rem(arr, val);
        System.out.println("Array after removing " + val + ": " + Arrays.toString(result));
	}
}
