import java.util.Arrays;
public class Charpresent {
  public static char[] chars(char[] arr,char ele) {
	  int index=-1;
	  for(int i=0;i<arr.length;i++)
	  if(arr[i]==ele) {
		  index=i;
	  break;
	  }
	  if(index==-1)
		  return new char[0];
  return Arrays.copyOfRange(arr, index+1, arr.length);
  }
	public static void main(String[] args)
	{
		char[] arr= {'b','a','n','g','t','a','n'};
		char ele='g';
		char[] ch= chars(arr,ele);
       System.out.println("the character present after a character:"+Arrays.toString(ch));
	}
}
