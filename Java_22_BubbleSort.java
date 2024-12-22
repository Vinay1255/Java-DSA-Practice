package DSA_Learning;

import java.util.Arrays;

public class Java_22_BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,-4,8,6,12,11};
		
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		int [] arr7 = {3,4,-1,1};
		
		bubbleSort(arr7);
		
		System.out.println(Arrays.toString(arr7));
	}
	
	static void bubbleSort(int[] arr) {
		boolean swapped;
		 
		// Run the steps n-1 times
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			// For each steps, Max item will come at the last respect index
			for(int j = 1;j < arr.length - i;j++) {
				// Swap if the item smaller than the previous item
				if(arr[j] < arr[j-1]) {
					// Swap
					int swap = arr[j];
					arr[j] = arr[j -1];
					arr[j -1] = swap;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
}
