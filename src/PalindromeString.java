
public class PalindromeString {
	public static void main(String[] args) {
		String str = "madam";
		String reverse = "";
		// for(int i=0;i<str.length();i++) {
		// }
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);

		}
		// System.out.println("original string"+" "+str);
//	    	 System.out.println("the reverse string"+" "+reverse);
		if (str.equals(reverse)) {
			System.out.println("is palindrome");
		} else {
			System.out.println("is not a palindrome");
		}
	}

}
