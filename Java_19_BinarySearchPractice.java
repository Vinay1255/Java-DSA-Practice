package DSA_Learning;

import java.util.Arrays;

public class Java_19_BinarySearchPractice {
	public static void main(String[] args) {
//		int[] arr = {2, 3, 5, 8, 12, 16, 21, 27, 36, 45};
//		int target = 1;
//		
//		int ans = ceilingBinary(arr, target);
//		System.out.println(ans);
//		
//		int ans2 = floorBinary(arr, target);
//		System.out.println(ans2);
//		
//		char[] ch = {'c', 'e', 'h', 'k', 'l', 'r', 'u', 'y'};
//		char chTarget = 'm';
//		
//		int ans3 = charBinary(ch, chTarget);
//		System.out.println(ans3);
//		
//		int[] arr2 = {5 ,6 ,7, 7, 7, 7, 7, 8, 8, 10};
//		int[] ans4 = searchRange(arr2, 6);
//		System.out.println(Arrays.toString(ans4));
//		
		int[] arr3 = {3, 5, 7, 9, 10, 90, 100, 130, 160, 170};
		int ans5 = ans(arr3, 90); 
		System.out.println(ans5);
		
//		int[] arr4 = {1, 3, 5, 7, 9, 8, 6, 4, 2};
//		int ans6 = mountainArray(arr4);
//		System.out.println(ans6);
		
//		int[] arr5 = {1, 3, 5, 7, 9, 8, 6, 4, 2};
//		int ans7 = search(arr5, 3);
//		System.out.println(ans7);
		
	}
	
	
	
//Program 1
//	Find the smallest number >= target
	static int ceilingBinary(int[] arr, int target) {
//		If the target is greater than greatest number in the array
		if(target > arr[arr.length-1]) {
			return -1;
		}
		
		int start = 0; 
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
			
		}
		
		return start;
	}
	
//Program 2
//	Find the floor of a number or greatest number <= target
	
	static int floorBinary(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid -1;
			}
			else if(target > arr[mid]) {
				start = mid +1;
			}
			else {
				return mid;
			}
		}
		
		return end;
	}
	
//Program 3
//	Find the smallest character >= target
	
	static int charBinary(char[] arr, char target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
			
		}
		
		return start;
	}
	
//Program 4
//	Find the first and last position of giving target number
	
	static int[] searchRange(int[] arr, int target) {
		int[] ans = {-1, -1};
		
		ans[0] = Search(arr, target, true);
		if(ans[0] != -1) {
			ans[1] = Search(arr, target, false);
		}
		
		return ans;
	}
	
	static int Search(int[] arr, int target, boolean findFirstIndex) {
		int ans = -1;
		int start = 0; 
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				ans = mid;
				if(findFirstIndex) {
					end = mid -1;
				}
				else {
					start = mid +1;
				}
			}
		}
		
		return ans;
	}
	
//Program 5
//	Find the element using Binary Search in infinite array
	
	static int ans(int[] arr, int target) {
//		First find the range
//		First start is a box of size 2
		int start = 0;
		int end = 1;
		
//		Condition for the target to lie in the range
		
		while(target > arr[end]) {
			int newStart = end +1;
			// Double the box size
			// end = previous end + size of box * 2
			
			end = end + (start - end + 1) * 2;
			start = newStart;
		}
		
		return infiniteArray(arr, target, start, end);
		
	}
	
	static int infiniteArray(int[] arr, int target, int start, int end) {
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid -1;
			}
			else if(target > arr[mid]) {
				start = mid +1;
			}
			else {
				return mid;
			}
		}
		
		return -1;		
	}
	
//Program 6
//	Find peck element in mountain array
	
	static int mountainArray(int[] arr) {
		int start = 0;
		int end = arr.length;
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid] > arr[mid + 1]) {
				// You are in dec part of array 
				// This may be the answer but look at the left
				
				end = mid;
				
			}
			else {
				// You are in asc part of array
				start = mid +1;
			}
		
		}
		// In the end, start == end and point to largest number because of the 2 check above
		// Start and end always trying to find max element in the above 2 check elements
		
		return start; // or end as both are ==
	}
	
//Program 7
//	Find element in mountain array
	
	static int search(int[] arr, int target) {
		int peak = mountainArray2(arr);
		int firstTry = OrderAgnosticBS(arr, target, 0, peak);
		
		if(firstTry != -1) {
			return firstTry;
		}
		
		return OrderAgnosticBS(arr, target, peak +1, arr.length -1);
	}
	
	static int mountainArray2(int[] arr) {
		int start = 0;
		int end = arr.length;
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid] > arr[mid + 1]) {
				// You are in dec part of array 
				// This may be the answer but look at the left
				
				end = mid;
				
			}
			else {
				// You are in asc part of array
				start = mid +1;
			}
		
		}
		// In the end, start == end and point to largest number because of the 2 check above
		// Start and end always trying to find max element in the above 2 check elements
		
		return start; // or end as both are ==
	}
	
	static int OrderAgnosticBS(int[] arr, int target, int start, int end) {
		
		
		boolean isAse = arr[start] < arr[end];
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAse) {
				if(target < arr[mid]) {
					end = mid -1;
				}
				else if(target > arr[mid]) {
					start = mid + 1;
				}
			}
			else {
				if(target < arr[mid]) {
					start = mid + 1;  
				}
				else if(target > arr[mid]) {
					end = mid - 1;
				}
			}
			
		}
		
		return -1;
	}
	
}
