public class RemoveDuplicateCharactersString {
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
			  
		  }
		  count=0;
	  }
	System.out.println(res);
}
}
	

	/*StringBuilder result=new StringBuilder();
	for(int i=0;i<str.length();i++) {
     char preschar=str.charAt(i);
     boolean isDuplicate = false;
		for(int j=0;j<result.length();j++) {
			if(preschar==result.charAt(j)) {
				isDuplicate = true;
				break ;
			}
			}
			if (!isDuplicate) {
		        result.append(preschar);
		    }
		}
	return result.toString();
}
public static void main(String[] args) {
	String str="seventeen";
	String rem=removedupcharstr(str);
	System.out.println("the duplicate characters of string:"+rem);
	}

}
*/