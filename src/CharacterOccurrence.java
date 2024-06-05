public class CharacterOccurrence {
 public static int charoccurrence(char[] arr,char c) {
	 int count=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]==c)
			 count++;
	 }
	 return count;
 }
	public static void main(String[] args) {
		char[] arr= {'s','u','b','b','u','s','b','p','y','b'};
		char c='b';
		int occurrence=charoccurrence(arr,c);
		System.out.println("character occurrence:"+occurrence);
	}
}