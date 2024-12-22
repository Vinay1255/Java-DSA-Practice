package DSA_Learning;

import java.util.Scanner;

public class Java_03_Fibonnacci {
	public static void main(String[] args) {
		
		System.out.println("Enter the number which you want to Fibonnacci:");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		(Print Fibonnaci number)
//Program 1
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i = 0;i <= n;i++) {
						
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
			
		}
		
		System.out.println(c);
		
//Program 2
		
//		int a = 0;
//		int b = 1;
//		
//		int count = 2;
//		
//		while(count <= n) {
//			
//			int temp = b;
//			b = temp + a;
//			a = temp;
//			
//			count++;
//		}
//		
//		System.out.println(b);
		

		
	}
	
}
