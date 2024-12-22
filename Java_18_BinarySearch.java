package DSA_Learning;

public class Java_18_BinarySearch {
	public static void main(String[] args) {
		int[] arr = {-18, -12, -4, 0, 1, 2, 3, 4, 6, 8, 12, 16, 18, 34, 68};
		int target = 17;
		
		int ans1 = binarySearch(arr, target);
		System.out.println(ans1);
		
		int[] arr2 = {89, 68, 45, 32, 25, 18, 16, 12, 9, 5, 3, 2, 0, -4, -8};
		target = 12;
		
		int ans2 = binarySearch2(arr2, target);
		System.out.println(ans2);
		
		System.out.println(searchOrderBinary(arr));
		System.out.println(searchOrderBinary(arr2));
		
		int ans3 = OrderAgnosticBS(arr, target);
		System.out.println(ans3);
		
		int ans4 = OrderAgnosticBS(arr2, target);
		System.out.println(ans4);
		
	}
	
//Program 1
	
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
//			int mid = (start + end) /2; might be that possible (start + end) exceed the range of int in java
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid -1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
				
	}
	
//Program 2
	static int binarySearch2(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				start = mid + 1;  
			}
			else if(target > arr[mid]) {
				end = mid - 1;
			}
			else {
				return mid;
			}
			
		}
		
		return -1;
	}
	
//Program 3
//	Order agnostic Binary Search
	
	static String searchOrderBinary(int[] arr) {
		if(arr[0] < arr[arr.length-1]) {
			return "Increasing Order";
		}
		else if(arr[0] > arr[arr.length -1]) {
			return "Decreasing Order";
		}
		else {
			return "Unexcepted Argument";
		}
	}
	
//Program 4
//	Find weather the array is shorted in ascending or descending
	
	static int OrderAgnosticBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
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
