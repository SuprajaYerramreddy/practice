import java.util.Arrays;
public class Merge {
	 public static int[] merge(int[] arr1, int[] arr2) {
	        int[] result = new int[arr1.length + arr2.length];
	        int i = 0, j = 0, k = 0;
	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] <= arr2[j]) {
	                result[k++] = arr1[i++];
	            } else {
	                result[k++] = arr2[j++];
	            }
	        }
	        while (i < arr1.length) {
	           result[k++] = arr1[i++];
	        }
	        while (j < arr2.length) {
	            result[k++] = arr2[j++];
	        }

	        return result;
	    }
	
	public static void main(String[] args) {
       int[] arr1= {3,5,4,8,1,6};
       int[] arr2= {23,14,35,21,54,9};
       int[] result = merge(arr1, arr2);
       System.out.println("Merged Array: " + Arrays.toString(result));

	}

}
