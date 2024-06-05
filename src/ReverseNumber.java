class ReverseNumber {
public static void main(String[] args) {
	
	int x=1234;
	int rev = 0;
	/*for(;x!=0;x/=10) {    //4 is eliminated
		 int digit=x%10;//4
		 rev=rev*10+digit;//0*10+4=4
	}*/
	/*while(x!=0){
		 
		 rev=rev*10+x%10;
		 x=x/10;
	}*/
	do {
		rev=rev*10+x%10;
		x=x/10;
	}
	while(x!=0); {
	System.out.println("reverse numeber:"+rev);
}
}
}
