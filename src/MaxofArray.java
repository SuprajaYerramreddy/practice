//import java.util.Scanner;
public class MaxofArray {
	public static Integer maxOfArray(int[] arr) {
		//if ((arr.length==0) || (arr==null))
			//return null;
		int max=0;
		for (int i : arr) {
			if (i>max)
				max=i;
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {36,18,49,23,54,46,33};
		Integer max=maxOfArray(arr);
		//if (max!=null)
			System.out.println("Max value in array is : "+max);
		//else
			//System.out.println("please give valid Array");
	}
}


			
	/*public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("size of an array:");
		int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("enter first element:");
        arr[0]=scanner.nextInt();
        int max=arr[0];
        for(int i=1;i<size;i++) {
        	System.out.println("enter the"+(i+1)+"element:");
        	arr[i]=scanner.nextInt();
        	if(arr[i]>max) {
        		max=arr[i];
        		
        	}
        }
        
        System.out.println("the max value is:"+" "+max);*/

