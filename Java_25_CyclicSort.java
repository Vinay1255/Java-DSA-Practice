package DSA_Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java_25_CyclicSort {
	public static void main(String[] args) {
		int[] arr = {3,5,2,1,4};
		
		cycleSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
		int ans = findMissingNumber(arr2);
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(ans);
		
		
		int[] arr3 = {4, 3, 2, 7, 8, 2, 3, 1};
		findMissingNumber2(arr3);
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(findMissingNumber2(arr3));
		
		int[] arr4 = {1, 3, 3, 4, 2};
		findMissingNumber3(arr4);
		
		
		System.out.println(Arrays.toString(arr4));
		System.out.println(findMissingNumber3(arr4));
		
		int[] arr5 = {4, 3, 2, 7, 8, 2, 3, 1};
		findDuplicateElement(arr5);
		
		System.out.println(Arrays.toString(arr5));
		System.out.println("Duplicate element");
		System.out.println(findDuplicateElement(arr5));
		
		int[] arr6 = {2,3,2};
		findRepetitionNumber(arr6);
		
		int[] ans1 = findRepetitionNumber(arr6);
		System.out.println(Arrays.toString(arr6));
		System.out.println(Arrays.toString(ans1));
		
		
		int [] arr7 = {3,4,-1,1};
		firstMissingPossitive(arr7);
		
		System.out.println(Arrays.toString(arr7));
		
	}
	
	static void cycleSort(int[] arr) {		
		int i = 0;
		// Program 1
		 while(i < arr.length) {
			 int check = arr[i] -1;
			 if(arr[i] != arr[check]) {
				 int temp = arr[arr[i] - 1];
				 arr[arr[i] - 1] = arr[i];
				 arr[i] = temp;
			 }
			 else {
				 i++;
			 }
		 }
		 
		 // Program 2
//		 while(i < arr.length) {
//
//			 if(arr[i] -1 != i) {
//				 int temp = arr[arr[i] - 1];
//				 arr[arr[i] - 1] = arr[i];
//				 arr[i] = temp;
//			 }
//			 else {
//				 i++;
//			 }
//		 }
		
	}
	
	
	
//Program 1 ###############################################
//	Find Missing Number in the Array = [9, 6, 4, 2, 3, 5, 7, 0, 1]
	
	static int findMissingNumber(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			int check = arr[i];
			if(arr[i] < arr.length && arr[i] != arr[check]) {
				swapped(arr, i, check);
			}
			else {
				i++;
			}
		}
		
		// Search for missing element
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] != j) {
				return j;
			}
		}
		
		return arr.length;
	}
	
	static void swapped(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
//Program 2 #################################################
//	Find missing and duplicate number in the Array [4, 3, 2, 7, 8, 2, 3, 1]
	
	static List<Integer> findMissingNumber2(int[] arr) {
		int i = 0;
		
		while(i < arr.length) {
			int check = arr[i] - 1;
			if(arr[i] != arr[check]) {
				swapped(arr,arr[i]-1,i);
			}
			else {
				i++;
			}
		}
		
		List<Integer> ans = new ArrayList<>();
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] != j + 1) {
				ans.add(j+1);
			}
		}
		
		return ans;
	}
	
//	Program 3
	
	static int findMissingNumber3(int[] arr) {
		int i = 0;
		
		while(i < arr.length) {
			int check = arr[i] - 1;
			
			if(arr[i] != i +1) {
				if(arr[i] != arr[check]) {
					swapped(arr, i, check);
				}
				else {
					return arr[i];
				}
			}
			else {
				i++;
			}
				
			
		}
		
//		for (int j = 0; j < arr.length; j++) {
//			if(arr[j] -1 != j) {
//				return arr[j];
//			}
//		}
		
		return arr.length;
	}
	
//	Program 4
	
	static List<Integer> findDuplicateElement(int[] arr){
		int i = 0;
		
		while(i < arr.length) {
			int check = arr[i] - 1;
			if(arr[i] != arr[check]) {
				swapped(arr, i, check);
			}
			else {
				i++;
			}
		}
		
		List<Integer> ans = new ArrayList<>();
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] != j + 1) {
				ans.add(arr[j]);
			}
		}
		
		return ans;
	}
	
	
//	Program 5
	
	static int[] findRepetitionNumber(int[] arr) {
		int i = 0;
		
		while(i < arr.length) {
			int check = arr[i] - 1;
			
			if(arr[i] != arr[check]) {
				int temp = arr[i];
				arr[i] = arr[check];
				arr[check] = temp;
			}
			else {
				i++;
			}
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] != j+1) {
					return new int[] {arr[j],j + 1};
				}
			}
			
		}
		
		return new int[] {-1,-1};
		
	}
	
	
	static int firstMissingPossitive(int[] arr) {
		int i = 0;
		
		while(i < arr.length) {
			int check = arr[i] -1;
			
			if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[check]) {
				int temp = arr[i];
				arr[i] = arr[check];
				arr[check] = temp;
			}
			else {
				i++;
			}
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] != j+1) {
					return j + 1;
				}
			}	
		}
		
		return arr.length + 1;
	}
	
}

