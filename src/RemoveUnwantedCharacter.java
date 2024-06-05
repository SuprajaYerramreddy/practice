import java.util.Arrays;
public class RemoveUnwantedCharacter {
 public static String[] removeunwantedcharacters(String[] arr,String regex) {
	 for(int i=0;i<arr.length;i++) {
		 arr[i] = arr[i].replaceAll(regex, "");
	 }
	 return arr;
 }
	public static void main(String[] args) {
		String[] arr = {"bangtansonyeondan", "seventeen", "tomorrow by together"};
        String regex = "[e-m]"; // 

        String[] modifiedStrings = removeunwantedcharacters(arr, regex);

        System.out.println("Modified array of strings: " + Arrays.toString(modifiedStrings));
    }

	}


