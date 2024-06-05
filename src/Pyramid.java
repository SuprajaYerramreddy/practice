class Pyramid{
	public static void main(String args[]) {
		int i=1,j=1, count = 4,count2=count;
		for(i=1;i<=count;i++) {
			System.out.print(" ".repeat(count2-1));
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			count2=count2-1;
		}
	}
}