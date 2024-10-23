import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,7,8,9};
		swap(arr,2,3);
		int temp = max(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("The greatest integer is : " + temp);
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void swap(int [] arr, int index1 , int index2) {
		// TODO Auto-generated method stub
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	private static int max (int [] arr) {
		if (arr.length == 0) {	
			return -1;
		}
		
		int max = arr[0];
		for (int i = 0; i<arr.length;i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void reverse (int [] arr) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			swap(arr,start,end);
			start = start + 1;
			end = end -1;
		}
	}

}
