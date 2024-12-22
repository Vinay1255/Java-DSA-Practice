package DSA_Learning;

public class Java_20_RotatedBinarySearch {
	public static void main(String[] args) {
		int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
		int ans1 = findPivot(arr);
		System.out.println(ans1);
		
		int target = 3;
		int ans2 = search(arr, target);
		System.out.println(ans2);
		
		int arr3[] = {3, 3, 3, 4, 5, 6, 7, 0, 1, 2, 3, 3};
		int ans3 = findPivotWithDuplicate(arr3);
		System.out.println(ans3);
		
		
		int arr4[] = {3, 4, 5, 6, 7, 0, 1, 2};
		int ans4 = findPivotRotationTime(arr4);
		System.out.println(ans4);
		
		int ans5 = countRotation(arr4);
		System.out.println(ans5);
		
	}
	
	static int search(int[] arr, int target) {
		int pivot = findPivot(arr);
		
		// if you don,t find Pivot, It means array is not rotated
		if(target != pivot) {
			// just do normal binary search
			return binarySearch(arr, target, 0, arr.length - 1);
		}
		
		// if Pivot is found, you have found 2 asc sorted array
		if(arr[pivot] == target) {
			return pivot;
		}
		
		if(target >= arr[0]) {
			return binarySearch(arr, target, 0, pivot - 1);
		}
		
		return binarySearch(arr, target, pivot + 1, arr.length -1);
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start <= end) {

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
	
//Program 1
	// This will not for duplicate value
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			// 4 cases over here
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if(arr[mid] <= arr[start]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
	
	
//Program 2
	// This will not for duplicate value
	static int findPivotWithDuplicate(int[] arr) {
		int start = 0;
		int end = arr.length -1;
			
		while(start <= end) {
			int mid = start + (end - start) / 2;
				
			// 4 cases over here
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			
			// if element middle, start, end are equal than skip the duplicates
			if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
				// skip the duplicate
				// NOTE: what if these element start and end were the pivot?
				// check if start is pivot
				
				if(arr[start] > arr[start + 1] ) {
					return start;
				}
				start++;
				
				// check whether end is pivot
				
				if(arr[end] < arr[end - 1]) {
					return end - 1;
				}
				end--;
				
			}
			// left side is sorted, so pivot is should be right
			else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			
		}
		
		return -1;
	}	

//Program 3
//	Check how many time Pivot is rotated
	
	static int countRotation(int[] arr) {
		int pivot = findPivotRotationTime(arr);
				
		return pivot + 1;
	}
	
	static int findPivotRotationTime(int[] arr) {
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			
			if(mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			
			if(arr[start] < arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		return -1;
	}
		
}
