package DSA_Learning;

import java.util.Scanner;
import java.util.Arrays;

public class Java_11_MultiDimensionArrays {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/* Example of MultiDemension Array
		 * 
		 * 	1 2 3
		 * 	4 5 6
		 * 	7 8 9
		 */
		
		int [][] arr = new int[3][3];
		
		System.out.println("Enter the 9 number of Arrays:");
//Program 1		
//		Take a input of MultiDeminesion Arrays
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
//Program 2
//		Take a input of MultiDeminesion Arrays
		
//		int[][] arr = {
//				{1, 2, 3},
//				{4, 5, 6},
//				{7, 8, 9}
//		};

		
//Program 2
//		Take a input of MultiDeminesion Arrays
		
//		int[][] arr = {
//				{1, 2, 3},
//				{4, 5},
//				{6, 7, 8, 9}
//		};
		
		
//		Print the MultiDimension Arrays
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		Print MultiDimension using Arrays.toString()
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
//		Print MultiDimension using for each loop
		
		for(int[] element: arr) {
			System.out.println(Arrays.toString(element));
		}
		
		
	}
}
