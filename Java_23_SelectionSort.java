package DSA_Learning;

import java.util.Arrays;

public class Java_23_SelectionSort {
	public static void main(String[] args) {
		
		
		int[] arr = {5,3,4,1,2};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// Find the max item in remaining array and swap with correct index
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);
			
			swapped(arr, maxIndex, last);
		}
	}
	
	static int getMaxIndex(int[] arr, int start, int end) {
		
		int max = start;
		
		for (int i = start; i <= end; i++) {
			if(arr[max] < arr[i]) {
				max = i;
			}
		}
		
		return max;
	}
	
	static void swapped(int[] arr, int first, int second) {
		int swap = arr[first];
		arr[first] = arr[second];
		arr[second] = swap;
	}
}
