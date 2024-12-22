package DSA_Learning;

public class Java_31_IntroductionToRecursion {
	public static void main(String[] args) {
//		message();
		
//		number1(1);
		
//		Print(1);
		
//		System.out.println(Fibonnaci(50));
		
		int[] arr = {1, 2, 3, 4, 55, 66, 78};
		int target = 1;
		
		int ans = BinarySearch(arr, target, 0, arr.length -2);
		System.out.println(ans);
		
	}
	
//1 Example
//	Print a message "Hello World" 5 Time
	static void message() {
		System.out.println("Hello World");
		message1();
	}
	
	static void message1() {
		System.out.println("Hello World");
		message2();
	}
	
	static void message2() {
		System.out.println("Hello World");
		message3();
	}
	
	static void message3() {
		System.out.println("Hello World");
		message4();
	}
	
	static void message4() {
		System.out.println("Hello World");
	}
	
//2 Example 
//	Print % number: 1 2 3 4 5
	
	static void number1(int n) {
		System.out.println(n);
		number2(2);
	}
	
	static void number2(int n) {
		System.out.println(n);
		number3(3);
	}
	
	static void number3(int n) {
		System.out.println(n);
		number4(4);
	}
	
	static void number4(int n) {
		System.out.println(n);
		number5(5);
	}
	
	static void number5(int n) {
		System.out.println(n);
	}
	
//3 Example
//	Function call it self
	
	static void Print(int n) {
		if(n == 5) {
			System.out.println(n);
			return;
		}
		
		System.out.println(n);
		
		Print(n + 1);
	}
	
//4 Example
//	Print n fibonacci 
	
	static int Fibonnaci(int n) {
		
		// Base condition 
		if (n < 2) {
			return n;
		}
		
		return Fibonnaci(n - 1) + Fibonnaci(n - 2);
	}
	
//5 Example 
//	Find the target using Binary Search function in Recursion
	
	static int BinarySearch(int[] arr, int target, int start, int end) {
		
		if(start > end) {
			return -1;
		}
		
		int mid = start + (end - start) / 2;
		
		if(arr[mid] == target) {
			return mid;
		}
		
		if (target < arr[mid]) {
			return BinarySearch(arr, target, start, mid - 1);
		}
		
		return BinarySearch(arr, target, mid + 1, end);
	}
	
}





