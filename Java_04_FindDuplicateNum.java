package DSA_Learning;

import java.util.Scanner;

public class Java_04_FindDuplicateNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		Long n = sc.nextLong();
		int count = 0;
		
		while(n > 0) {
			long rem = n % 10;
			
			if(rem == 5) {
				count++;
			}
			
			n /= 10;
		}
		
		System.out.println(count);
	}
}
