package DSA_Learning;

import java.util.Arrays;

public class Java_10_ArraysAndFunction {
	public static void main(String[] args) {
		
		int[] num = {4, 5, 6, 7};
		
//		System.out.println(Arrays.toString(num));
//		
//		change(num);
//		System.out.println(Arrays.toString(num));
		
		int[] arr = {8, 45, 9, 4, 7, 6, 35, 35, 99};
		
//		swap(arr, 1, 3);
//		
//		System.out.println(Arrays.toString(arr));
		
//		System.out.println(max(arr));
//		
//		System.out.println(maxRange(arr,2,6));
		
		reverse(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}


	
// Find maximum element in array
	
	static int max(int[] arr) {
		
		if(arr.length == 0) {
			return -1;
		}
		int maxVal = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		
		return maxVal;
	}
	
// Find maximum element in range of array
	
	static int maxRange(int[] arr, int start, int end) {
		
		if(end > start) {
			return -1;
		}
		if(arr == null) {
			return -1;
		}
		
		int maxVal = arr[0];
		
		for (int i = start; i <= end; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		
		return maxVal;
	}
	
// Print reverse array
	
	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		
	}
	
	// Swap index of array
		static void swap(int[] arr, int index1, int index2) {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			
		}
	
	
	static void change(int[] arr) {
		arr[0] = 99;
	}
	
	
}
