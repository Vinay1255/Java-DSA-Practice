package DSA_Learning;

import java.util.Arrays;

public class Java_16_LinearSearch2DArray {
	public static void main(String[] args) {
		int[][] arr = {
				{23, 4, 1},
				{18, 12, 3, 9},
				{78, 99, 34, 56},
				{18, 12}
		};
		
		int target = 34;
		int[] ans = search(arr,target); // Format return value {Row, Col}
		System.out.println(Arrays.toString(ans));
		
		int ans2 = max(arr);
		System.out.println(ans2);
		
		int ans3 = max2(arr);
		System.out.println(ans3);
		
		int ans4 = min(arr);
		System.out.println(ans4);
		
		int ans5 = min2(arr);
		System.out.println(ans5);
		
	}

//Program 1
//	Search an element in the array
	static int[] search(int[][] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == target) {
					return new int[] {i, j};
				}
			}
		}
		
		return new int[] {-1, -1};
	}
	
//Program 2
//	Find maximum element in the array
	static int max(int[][] arr) {
		int element = arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(element < arr[i][j]) {
					element = arr[i][j];
				}
			}
		}
		
		return element;
	}
	
//Program 3
//	Find maximum element in the array using each for loop
	static int max2(int[][] arr) {
		int max = arr[0][0];
		
		for (int[] row : arr) {
			for (int element : row) {
				if(max < element) {
					max = element;
				}
			}
		}
		
		return max;
	}
	
//Program 4
//	Find maximum element in the array
	static int min(int[][] arr) {
		int element = arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(element > arr[i][j]) {
					element = arr[i][j];
				}
			}
		}
		
		return element;
	}
	
//Program 5
//	Find maximum element in the array using each for loop
	static int min2(int[][] arr) {
		int min = arr[0][0];
		
		for (int[] row : arr) {
			for (int element : row) {
				if(min > element) {
					min = element;
				}
			}
		}
		
		return min;
	}
	
}
 