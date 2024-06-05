 class ReverseLetters {
	 public static void main(String args[]) {
		 String string="Borahae";
		 String reverse=" ";
		 for(int i=string.length()-1;i>=0;i--) {
			 reverse +=string.charAt(i);
		 }
		 System.out.println("Original string"+string);
		 System.out.println("reversed string"+reverse);
	 }

}
