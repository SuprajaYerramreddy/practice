import java.util.Arrays;
 public class MoveZeros {
	    public static void moveZerosToEnd(int[] arr) {
	        int n = arr.length;
	        int index = 0; 
	        for (int i = 0; i < n; i++) {
	            if (arr[i] != 0) {
	                arr[index] = arr[i];
	                index++;
	            }
	        }
	        // Fill the remaining positions with zeros
	        while (index < n) {
	            arr[index] = 0;
	            index++;
	        }
	    }
	    public static void main(String[] args) {
	        int[] arr = {0, 1, 0, 3, 12, 0, 0, 5, 6};
	        System.out.println("Original array: " + Arrays.toString(arr));
	        moveZerosToEnd(arr);
	        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
	    }
	}

