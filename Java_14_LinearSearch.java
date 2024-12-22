package DSA_Learning;

//import java.util.Iterator;

public class Java_14_LinearSearch {
	public static void main(String[] args) {
		int[] num = {45, 19, 42, 1, 6, 8, 63, 78, 4, 6, 78, 96};
		int target = 63;
		
//		int ans1 = linearSearch(num, target);
//		System.out.println(ans1);
//		
//		int ans2 = linearSearch2(num, target);
//		System.out.println(ans2);
//		
//		boolean ans3 = linearSearch3(num, target);
//		System.out.println(ans3);
//		
//		int ans4 = linearSearch4(num, target, 1, 6);
//		System.out.println(ans4);
//		
//		int ans5 = min(num);
//		System.out.println(ans5);
//		
//		int ans6 = max(num);
//		System.out.println(ans6);
		
		int ans7 = countEven(num);
		System.out.println(ans7);
		
		int ans8 = countOdd(num);
		System.out.println(ans8);
						
	}

//Program 1
//	Search the element of Array
	
	static int linearSearch(int[] arr, int target) {
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		
		for (int index = 0; index < arr.length; index++) {
			// Check for element at every index if it is = target
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		
		// Hence the target not found
		return Integer.MAX_VALUE;
	}
	
//Program 2
//	Search the target and return the element
	
	static int linearSearch2(int[] arr, int target) {
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		
		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}
		
		// Hence the target not found
		return Integer.MAX_VALUE;
		
	}
	
//Program 3
//	Search the target and return the element
	
	static boolean linearSearch3(int[] arr, int target) {
		if(arr.length == 0) {
			return false;
		}
		
		for (int index = 0; index < arr.length; index++) {
			// Check for element at every index if it is = target
			int element = arr[index];
			if(element == target) {
				return true;
			}
		}
		
		// Hence the target not found
		return false;
		
	}
	
//Program 4
//	Search the element of Array in range
	
	static int linearSearch4(int[] arr, int target, int start, int end) {
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		
		for (int index = start; index < end; index++) {
			// Check for element at every index if it is = target
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		
		// Hence the target not found
		return Integer.MAX_VALUE;
	}
	
//Program 5
//	Search minimum number of the array
	
	static int min(int[] arr) {
		
		int element = arr[0];
		
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		
		for (int i = 0; i < arr.length; i++) {
						
			if(arr[i] < element) {
				element = arr[i];
			}
			
		}
		
		return element;
		
	}
	
//Program 6
//	Search maximum number of the array
	
	static int max(int[] arr) {
		
		int element = arr[0];
		
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		
		for (int i = 1; i < arr.length; i++) {
						
			if(arr[i] > element) {
				element = arr[i];
			}
						
		}
		
		return element;
		
	}
	
//Program 7
//	Count how many even number in the array
	
	static int countEven(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count++;
			}
		}
		
		return count;
	}
	
//Program 7
//	Count how many odd number in the array
	
	static int countOdd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				count++;
			}
		}
		
		return count;
	}
	
}
