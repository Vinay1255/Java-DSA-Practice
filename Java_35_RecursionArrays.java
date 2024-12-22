package DSA_Learning;

import java.util.ArrayList;

public class Java_35_RecursionArrays {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
		
//		System.out.println(Sorted(arr, 0));
		
//		System.out.println(LinearSearch1(arr, 4, 0));
		
//		System.out.println(LinearSearch2(arr, 18, 0));
		
//		System.out.println(LinearSearch3(arr, 18, arr.length - 1));
		
		int[] arr2 = {1, 2, 3, 4, 4, 5, 4, 8, 9};
		
//		LinearSearch4(arr2, 4, 0);
//		
//		System.out.println(list);
		
		
//		System.out.println(LinearSearch5(arr2, 4, 0, new ArrayList<>()));
		
//		System.out.println(LinearSearch6(arr2, 4, 0));
		
		
		int[] arr3 = {5, 6, 7, 8, 9, 1, 2, 3};
		System.out.println(RotatedBinarySearch(arr3, 2, 0, arr3.length - 1));
		
	}
	
	
// Function 1 -> Check Array is sorted or not
	static boolean Sorted(int[] arr, int index) {
		if(index == arr.length - 1) {
			return true;
		}
		
		return arr[index] < arr[index + 1] && Sorted(arr, ++index);
	}
	
	
// Function 2 -> Linear Search Check Target is exist or not
	static boolean LinearSearch1(int[] arr, int target, int index) {
		if(index == arr.length) {
			return false;
		}
		
		return target == arr[index] || LinearSearch1(arr, target, ++index);
	}
	
// Function 3 -> Linear Search Return index of target element
	static int LinearSearch2(int[] arr, int target, int index) {
		if(index == arr.length) {
			return -1;
		}
		
		if(target == arr[index]) {
			return index;
		}
		else {
			return LinearSearch2(arr, target, ++index);
		}
	}
	
// Function 4 -> Reverse Linear Search Return index of target element
	static int LinearSearch3(int[] arr, int target, int index) {
		if(index == -1) {
			return -1;
		}
		
		if(target == arr[index]) {
			return index;
		}
		else {
			return LinearSearch3(arr, target, --index);
		}
	}
	
	
// Function 5 -> Linear Search Find All indexes of target element
	static ArrayList<Integer> list = new ArrayList<>();
	
	static void LinearSearch4(int[] arr, int target, int index) {
		if(index == arr.length) {
			return;
		}
		
		if(arr[index] == target) {
			list.add(index);
		}
		
		LinearSearch4(arr, target, ++index);
	}
	
	
// Function 6 -> Linear Search Find All indexes of target element with return ArrayList
	static ArrayList<Integer> LinearSearch5(int[] arr, int target, int index, ArrayList<Integer> list) {
		if(index == arr.length) {
			return list;
		}
		
		if(arr[index] == target) {
			list.add(index);
		}
		
		return LinearSearch5(arr, target, ++index, list);
	}
	
// Function 7 -> Linear Search Find All indexes of target element with return ArrayList and without passing ArrayList 
	static ArrayList<Integer> LinearSearch6(int[] arr, int target, int index) {
		ArrayList<Integer> list = new ArrayList<>();
		
		if(index == arr.length) {
			return list;
		}
		
		// This contain answers for that function only
		if(arr[index] == target) {
			list.add(index);
		}
		
		ArrayList<Integer> ansFromBelowCalls = LinearSearch6(arr, target, ++index);
		
		list.addAll(ansFromBelowCalls);
		
		return list;
	}
	
	
	
// Function 8 -> Rotated Binary Search
	static int RotatedBinarySearch(int[] arr, int target, int s, int e) {
		if(s > e) {
			return -1;
		}
		
		int m = s + (e - s) / 2;
		
		if(arr[m] == target) {
			return m;
		}
		
		if(arr[s] <= arr[m]) {
			if(target >= arr[s] && target <= arr[e]) {
				return RotatedBinarySearch(arr, target, s, m - 1);
			}
			else {
				return RotatedBinarySearch(arr, target, m + 1, e);
			}
		}
		
		if(target >= arr[m] && target <= arr[e]) {
			return RotatedBinarySearch(arr, target, m + 1, e);
		}
		else {
			return RotatedBinarySearch(arr, target, s, m - 1);
		}
		
	}
	
	
}








