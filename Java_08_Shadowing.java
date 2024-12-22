package DSA_Learning;

import java.util.Arrays;
import java.lang.Math.*;
import java.util.Scanner;

public class Java_08_Shadowing {
	
	static int x = 90; // this will be shadow at line
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(x); // 90
//		
//		int x; // The class variable at line 4 is shadowing by this
//		
////		System.out.println(x); -> Throw an error because scope will begin when value is initialised
//		
//		x = 40;
//		
//		System.out.println(x); // 40 
//		
//		fun();
		
//		varArgs(45,52,45,78,41,74);
//		
//		multipleArgs(45, 56, "Vinay", "Singh", "Sehdev");
		
//		System.out.println("Enter the Prime number:");
//		
		int n = sc.nextInt();
//		
		boolean ans = isPrime(n);
//		
		System.out.println(ans);
		
//		for(int i = 100;i <= 100000;i++) {
//			if(isArmstrong(i)) {
//				System.out.println(i);
//			}
//		}
		
		
	}
	
	static void fun() {
		
		System.out.println(x); // 90
		int x = 45;
		System.out.println(x); // 45
	}
	
	static void varArgs(int ...v) {
		int sum = 0;
		for(int arr: v) {
			sum = sum + arr;
		}
			
		System.out.println(sum);
//		System.out.println(Arrays.toString(v));
	}
	
	static void multipleArgs(int x, int y, String ...s) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(Arrays.toString(s));
	}
	
	static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		int c = 2;
		
		while(c * c <= n) {
			if(n % c == 0) {
				return false;
			}
			c++;
		}
		
		if(c * c > n) {
			return true;
		}
		
		return false;
	}
	
	
	static boolean isArmstrong(int n) {
		int original = n;
		int n1 = n;
		double sum = 0;
		int count = 0;
		
		while(n1 > 0) {
			n1 = n1 / 10;
			count++;			
		}
		
		while(n > 0) {
			int rem = n % 10;
			n = n / 10;
			sum = sum + Math.pow(rem, count);
		}
		
		return original == sum;
	}
	
}








