package DSA_Learning;

import java.util.Arrays;

public class Java_24_InsertionSort {
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1,8};
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if(arr[j]<arr[j-1]) {
					swapped(arr,j, j-1);
				}
				else {
					break;
				}
			}
		}
	}
	
	static void swapped(int[] arr, int first, int second) {
		int swap = arr[first];
		arr[first] = arr[second];
		arr[second] = swap;
	}
	
}
