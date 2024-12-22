package DSA_Learning;

import java.util.Iterator;

public class Java_36_RecursionPattern {
	public static void main(String[] args) {
		
		Pattern1(4,0);
		
//		Pattern2(4,0);
		
	}
	
	static void Pattern1(int r, int c) {
		
		if(r == 0) {
			return;
		}
		
		if(c < r) {
			Pattern1(r, ++c);
			System.out.print("* ");
		}
		else {
			Pattern1(--r, 0);
			System.out.println();
		}
		
	}
	
	static void Pattern2(int r, int c) {
		
		if(r == 0) {
			return;
		}
		
		if(r > c) {
			System.out.print("* ");
			Pattern1(r, ++c);
		}
		else {
			System.out.println();
			Pattern1(--r, 0);
		}
		
	}
}
