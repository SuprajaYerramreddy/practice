 /*class Fibonacci {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,count=1;
//		System.out.print(n1+" "+n2);
		for(i=2;i<count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		// TODO Auto-generated method stub

	}

}
*/
/*class Fibonacci {
	public static void main(String[] args) {
		int count = 10; // Let's say we want to print the first 10 Fibonacci numbers
		int[] fib = new int[count]; // Create an array to store Fibonacci numbers

		// Initialize the first two Fibonacci numbers
		if (count > 0) fib[0] = 0;
		if (count > 1) fib[1] = 1;

		// Generate the Fibonacci sequence and store it in the array
		for (int i = 2; i < count; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		// Print the Fibonacci sequence
		for (int i = 0; i < count; i++) {
			System.out.print(fib[i] + " ");
		}
	}
}*/ 
// using recursion
class Fibonacci{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){    
  int count=10;    
  System.out.print(n1+" "+n2);//printing 0 and 1    
  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
}  
