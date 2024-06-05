import java.util.Arrays;
public class RemoveDuplicate {
public static int[] removeduplicates(int[] arr) {
	int index=0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]!=arr[index]) {
			index++;
			arr[index]=arr[i];
		}
	}
	int[] uniqueArr = new int[index+1];
    System.arraycopy(arr, 0, uniqueArr, 0,index+1);
	return uniqueArr;
}
	public static void main(String[] args) {
		int[] arr= {2,3,3,4};
       Arrays.sort(arr);
        int[] result = removeduplicates(arr);
        System.out.println("the removed duplicates:"+Arrays.toString(result));
	}

}
/*import java.util.Arrays;

public class RemoveDuplicate {
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        int[] uniqueArr = new int[uniqueIndex + 1];
        System.arraycopy(arr, 0, uniqueArr, 0, uniqueIndex + 1);
        return uniqueArr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 2, 3, 2, 4, 3, 2, 3, 4};
        Arrays.sort(arr);

        int[] result = removeDuplicates(arr);
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}*/
