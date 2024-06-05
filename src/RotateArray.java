/*import java.util.Arrays;
public class RotateArray {
	public static void main(String[] args) {
	        //Initialize array     
	        int [] arr = new int [] {1, 2, 3, 4, 5};         
	        int n = 2;    
	        System.out.println("Original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }       
	        for(int i = 0; i < n; i++){    
	            int j, last;      
	            last = arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--){       
	                arr[j] = arr[j-1];    
	            }      
	            arr[0] = last;    
	        }    
	        System.out.println();      
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }    
 	    }    
}*/
import java.util.Arrays;

public class RotateArray {
	public static void rightShift(int array[],int num) {
		for(int i=0;i<num;i++) {
		int temp=array[array.length-1];
		for(int j=array.length-1;j>0;j--)
			array[j]=array[j-1];
		array[0]=temp;
	}
		for(int a:array)
			System.out.print(a);
	}
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(rightShift([1,2,3,4,5], 2)));
		
		rightShift(new int[]{1,2,3,4,5}, 2);
	}

}

