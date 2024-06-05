
public class NumberOfVowels {

	public static int stringvowels(String str) {
		int count=0;
		String vowels="aeiouAEIOU";
		for(int i=0;i<str.length();i++) {
			if(vowels.indexOf(str.charAt(i))!=-1) {
				count++;
			}
		}
		return count;
	}
 public static void main(String[] args) {
	 String str="borahaae";
	int string=stringvowels(str);
	 System.out.println("number of vowels:"+string);
 }
}
