package DSA_Learning;

import java.util.ArrayList;import java.util.Arrays;
import java.util.Iterator;

public class Java_33_MathForDSA {
	public static void main(String[] args) {

// 1 Method
//		int n = 20;
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println(i + " " + isPrimeNumber(i));
//		}
		
		
// 2 Method
//		int n = 100;
//		
//		boolean[] prime = new boolean[n + 1];
//		printPrime(n, prime);
		
		
// 3 Method
//		int n = 40;
//		int p = 3;
//		
//		System.out.printf("%.3f", findSquareRoot(n, p));
		
// 4 Method
		System.out.println(sqrtMethod(10));
		
	}
	
	
// 1 -> Check number is prime or not
	public static boolean isPrimeNumber(int n) {
		
		if(n <= 1) {
			return false;
		}
		
		int c = 2;
		
		while (c * c <= n) {
			
			if((n % c) == 0) {
				return false;
			}
			
			c++;
		}
		
		return true;
	}
	

// 2 -> Advanced method for print Prime number
	public static void printPrime(int n, boolean[] primes) {
		
		for(int i = 2; i*i <= n; i++) { 
			if(!primes[i]) {
				for(int j = i*2; j <= n; j+=i) {
					primes[j] = true;
				}
			}
		}
		
		for(int i = 2; i <= n; i++) {
			if(!primes[i]) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
// 3 -> Find Square Root of a number using binary search
	public static double findSquareRoot(int n, int p) {
		int s = 0;
		int e = n;
		
		double root = 0.0;
		
		while(s <= e) {
			int m = s + (e - s) / 2;
			
			if(m * m == n) {
				root = m;
				return root;
			}
			
			if(m * m > n) {
				e = m - 1;
			}
			else {
				s = m + 1;
			}
		}
		
		double incr = 0.1;
		
		for (int i = 0; i < p; i++) {
			while(root * root <= n) {
				root += incr;
			}
			
			root -= incr;
			incr /= 10;
		}
		
		
		return root;
	}
	
	
// 3 -> Square Root Method
	public static double sqrtMethod(double n) {
		
		double x = n;
		
		double sqrt;
		
		while(true) {
			
			sqrt = 0.5 * (x + (n/x));
			
			if(Math.abs(sqrt - x) < 0.1) {
				break;
			}
			
			x = sqrt;
		}
		return sqrt;
		
	}

	
}











