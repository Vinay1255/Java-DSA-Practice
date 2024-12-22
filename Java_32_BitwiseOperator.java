package DSA_Learning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Java_32_BitwiseOperator {

	public static void main(String[] args) {
		
// 1 Method
//		int a = 80;
//		System.out.println(isOdd(a));
		
		
// 2 Method		
//		int[] arr = {2, 3, 3, 4, 2, 6, 4};
//		
//		System.out.println(findUnique(arr));
		
		
// 3 Method
//		int n = 3;
//		System.out.println(checkUnique(n));
		

// Print number into binary form ###########################################################################
//		int n = 10;
//		
//		int[] arr = new int[noOfDigit(n)];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[(arr.length - 1) - i] = (n & 1);
//			n = n >> 1;
//		}
//		
//		System.out.println(Arrays.toString(arr));
// #########################################################################################################
	
		
// 4 Method 
//		int n = 10;
//		
//		System.out.println(noOfDigit(n));
		
	
// 5 Method 
//		int n = 0;
//		
//		System.out.println(findPower(n));
		
		
// 6 Method
//		int base = 3;
//		int power = 6;
//		
//		System.out.println(calculatePower(base, power));
		

// 7 Method
//		int n = 19;
//		
//		System.out.println(countBits(n));
		
		
// 8 Method -> Range XOR for a, b = xor(b) ^ xor(a - 1)
//		int a = 3;
//		int b = 9;
//		
//		System.out.println(xor(b) ^ xor(a -1));

		
// 9 Method
		
		
		int[][] arr = {
				{1, 1, 0},
				{1, 0, 1},
				{0, 0, 0}
		};
		
		int[][] arr2 = {
				{1,1,0},
				{0,1,0},
				{1,0,1}
		};
		
		
		int[][] ans = flipAndInvertImage(arr);
		int[][] ans2 = flipAndInvertImage(arr2);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(Arrays.toString(ans[i]));
		}
		
		System.out.println();
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(Arrays.toString(ans2[i]));
		}
		
		
	}
	

// 1 -> Check Odd number using &
	public static boolean isOdd(int n) {
		return ((n & 1) == 1);
	}
	

// 2 -> Find Unique number
	public static int findUnique(int[] arr) {
		int unique = 0;
		
		for(int n : arr) {
			unique = unique ^ n;
		}
		
		return unique;
	}
	
	
// 3 -> Check nth magic number
	public static int checkUnique(int n) {
		
		int ans = 0;
		int base = 5;
		
		while(n > 0) {
			
			int last = n & 1;
			n = n >> 1;
			
			ans += last * base;
			base = base * 5;
		}
		
		return ans;
		
	}
	

// 4 -> Check no of binary digit of any number
	public static int noOfDigit(int n) {
		int b = 2;
		
		int ans = (int)(Math.log(n) / Math.log(b)) + 1;
		
		return ans;
	}
	

// 5 -> Find it its power of 2 or not
	public static boolean findPower(int n) {
		
		if(n == 0) {
			return false;
		}
		
		return (n & (n-1)) == 0;
		
	}
	
	
// 6 -> Calculate power using binary
	public static int calculatePower(int b, int p) {
		int ans = 1;
		
		while(p > 0) {
			if((p & 1) == 1) {
				ans *= b;
			}
			
			b *= b;
			p = p >> 1;
		}
		
		return ans;
	}
	
	
// 7 -> Count number of bits
	public static int countBits(int n) {
		int count = 0;
		System.out.println(Integer.toBinaryString(n));
		
		while(n > 0) {
			count++;
			
			n = n & n-1;
			System.out.println(Integer.toBinaryString(n));
		}
		
		
		return count;
	}
	
	
// 8 -> This give XOR 0 to a
	public static int xor(int a) {
		if(a % 4 == 0) {
			return a;
		}
		
		if(a % 4 == 1) {
			return 1;
		}
		
		if(a % 4 == 2) {
			return a + 1;
		}
		
		return 0;
	}
	
	
// 9 -> Flip image
	public static int[][] flipAndInvertImage(int[][] image){
		
		// {1, 1, 0}
		
		for(int[] row : image) {
			// Reverse this array
			for (int i = 0; i < (image.length + 1) /2; i++) {
				// Swap
				int temp = row[i] ^ 1;
				row[i] = row[image[0].length - i - 1] ^ 1;
				row[image[0].length - i - 1] = temp;
			}
		}
		
		
		return image;
		
	}

}


















