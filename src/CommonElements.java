import java.util.Arrays;
public class CommonElements {
   public static char[] commonele(char[] arr1,char[] arr2) {
	   char[] temp=new char[0];
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				char[] newArr = new char[temp.length+1 ];
                System.arraycopy(temp, 0, newArr, 0, temp.length); 
                newArr[temp.length] = arr1[i]; 
                temp = newArr; 
			}
		}
	}
	   return temp;
   }
	public static void main(String[] args) {
		char[] arr1= {'b','a','n','g'};
		char[] arr2= {'t','a','n'};
         char[] ch=commonele(arr1,arr2);
         System.out.println("the common elements are:"+Arrays.toString(ch));
	}

}
