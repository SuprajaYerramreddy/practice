
public class FindFirstAndLastIndex {
	public static int[] findfirstandlastindex(int arr[],int n) {
		int Firstindex=-1;
		int lastindex=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				if(Firstindex==-1) {
					Firstindex=i;
				}
				lastindex=i;
			}
		}
	return new int[] {Firstindex,lastindex};
	}
	public static void main(String[] args) {
	int[] arr= {2,3,4,5,6,7,3,4,5,2,3,6,9,8,5};
	int n=3;
	int[] result=findfirstandlastindex(arr,n);
     System.out.println("First index:"+result[0]);
	 System.out.println("Last index:"+result[1]);
	}

}
