public class Duplicate {
	/*public static void main(String[] args) {
		int[] arr= {37,28,99,49,99};
		System.out.println("the duplicate values are:");
		 for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  {
	                	System.out.println("true");
	                }
	                else {
	                	System.out.println("false");
	                }
	            
	}

}
}*/
	public static void dup(int[] arr) {
		System.out.println("the duplicate values are:");
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  {
                	System.out.println("true");
                }
                else {
                	System.out.println("false");
                }      
}
	}
		
}
	public static void main(String[] args) {
		int[] arr= {37,28,99,49,99};
		dup(arr);
		
	}
}