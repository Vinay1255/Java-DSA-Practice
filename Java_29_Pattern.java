package DSA_Learning;

import java.util.Iterator;
import java.util.Scanner;

public class Java_29_Pattern {
	public static void main(String[] args) {
		
		System.out.println("Enter the number...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		Pattern1(n);
		System.out.println();
		Pattern2(n);
		System.out.println();
		Pattern3(n);
		System.out.println();
		Pattern3B(n);
		System.out.println();
		Pattern4(n);
		System.out.println();
		Pattern5(n);
		System.out.println();
		Pattern6(n);
		System.out.println();
		Pattern6B(n);
	}
	
	static void Pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void Pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void Pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void Pattern3B(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void Pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i ; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	static void Pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}
	}
	
	static void Pattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void Pattern6B(int n) {
		for (int i = 1; i <= 2*n; i++) {
			int totalComumnInRow = i > n ? 2 * n - i : i; // New pattern formula (if i greater than n than totalComumnInRow = 2 * n - i Else totalCumumnInRow = i) 
			
			for (int j = 0; j < totalComumnInRow; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
}
