
public class Palindrome {
public static void main(String[] args) {
	int num=121,temp;
	int pali=0;
	temp=num;
	for(;num!=0;num=num/10) {
		pali=pali*10+num%10;
		
	}
	if(temp==pali) {
	System.out.println("is a plaindrome");
}
	else {
		System.out.println("not a palindrome");
	}
}
}
/* public static boolean isPalindrome(int num) {
    String original = Integer.toString(num);
    String reversed = new StringBuilder(original).reverse().toString();
    return original.equals(reversed);
}*/