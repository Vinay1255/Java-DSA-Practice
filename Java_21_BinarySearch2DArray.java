package DSA_Learning;

import java.util.Arrays;

public class Java_21_BinarySearch2DArray {
	public static void main(String[] args) {
		int[][] arr = {
				{10, 20, 30, 37},
				{15, 25, 35, 45},
				{28, 29, 36, 49},
				{33, 34, 38, 50}
		};
		
		int[] ans = search(arr,10);
		System.out.println(Arrays.toString(ans));
		System.out.println(arr.length);
		
	}

//Program 1
	static int[] search(int[][] matrix, int target) {
		int r = 0;
		int c = matrix.length - 1;
				
		while(r < matrix.length && c >= 0) {
			if(matrix[r][c] == target) {
				return new int[] {r, c};
			}
			
			if(matrix[r][c] < target) {
				r++;
			}
			else {
				c--;
			}
		}
		
		return new int[] {-1, -1};
	}
	
//Program 2
//	Search in the row provided between the cols provided
	static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
		while(cStart < cEnd) {
			int mid = cStart + (cEnd - cStart) / 2;
			
			if(matrix[row][mid] == target) {
				return new int[] {row, mid};
			}
			
			if(matrix[row][mid] < target) {
				cStart = mid + 1;
			}
			else {
				cEnd = mid - 1;
			}
		}
		
		return new int[] {-1, -1};
	}
	
	static int[] search2(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		if(rows == 1) {
			return binarySearch(matrix, 0, 0, -1,target);
		}
		
		return new int[] {-1, -1};
		
	}
	
}
