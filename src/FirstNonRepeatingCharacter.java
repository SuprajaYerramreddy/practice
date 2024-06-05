 public class FirstNonRepeatingCharacter {
	public static void main(String[] str) {
		  String s="Supraja Yerramreddy".toLowerCase();
		  String res=" ";
		  char[] c=s.toCharArray();
		  int count=0;
		  for(int i=0;i<c.length;i++) {
			  for(int j=0;j<c.length;j++) {
				  if(c[i]==c[j]) {
					  count++;
				  }
			  }
			  if(count==1) {
				  res=res.concat(c[i]+"");
				  break;
			  }
			  count=0;
		  }
		System.out.println("the first non repating character is:"+res);
	}
	}

