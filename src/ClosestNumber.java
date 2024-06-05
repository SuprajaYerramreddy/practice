
public class ClosestNumber {
	public static int findclosest(int[] arr,int n) {
		
		int closest=arr[0];
		int difference=Math.abs(arr[0]-n);
		for(int i=1;i<arr.length;i++) {
			int currentdifference=Math.abs(arr[i]-n);
			if(currentdifference<difference) {
				difference=currentdifference;
				closest=arr[i];
			}
		}
		return closest;
	}
	public static void main(String[] args) {
		int[] arr= {23,43,45,36,27,87,54,98,100};
		int n=58;
	 int closest=findclosest(arr,n);	
     System.out.println("the closest number is:"+closest);
	}

}
