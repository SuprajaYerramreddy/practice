
public class CharacterOccur {
public static int characters(char[] arr,char c) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==c) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
	 char[] arr= {'s','u','p','r','a','j','a'};
			 char c='a';
	 int occurence=characters(arr,c);
	 System.out.println("the occurence of characters:"+occurence);

	}

}
