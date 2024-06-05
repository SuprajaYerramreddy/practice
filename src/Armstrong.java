public class Armstrong {
		public static void main(String[] args) {
		/*int number = 153, temp = 0, sum = 0, p = 0, o = number;
	int b = String.valueOf(number).length();
		while (number != 0) {
			temp = number % 10;
			number = number / 10;
			p = (int) Math.pow(temp, b);
			sum = sum + p;
		}
		if (o == sum) {
			System.out.println("is a Armstrong");
		} else {
			System.out.println("not a Armstrong");*/
		
	


      /*  int number = 371, originalNumber=number, remainder, result = 0;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }*/
			int number = 153, originalNumber=number, remainder, result = 0, n = 0;
			for (;originalNumber != 0; originalNumber /= 10, ++n) {
	        originalNumber = number;
	        for (;originalNumber != 0; originalNumber /= 10)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, n);
	        }
			}
        if(result == number) {
            System.out.println(number + " is an Armstrong number.");
        }
        else {
            System.out.println(number + " is not an Armstrong number.");
        }
		}
}