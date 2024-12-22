package DSA_Learning;

import java.util.ArrayList;
import java.util.Collections;

public class Java_33_MathForDSA2 {
	public static void main(String[] args) {
		
//		factors1(50);
//		factors2(20);
		factors3(20);
		
	}
	
// 1 -> Find Factor of a number -| O(n)
	public static void factors1(int n) {
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + ", ");
			}
		}
		
	}
	
// 2 -> Find Factor of a number using sqrt -| O(sqrt(n)
	public static void factors2(int n) {
		
		for(int i = 1; i <= Math.sqrt(n); i++) {
			
			if(n % i == 0) {
				
				if(n/i == i) {
					System.out.print(i + " ");
				}
				
				System.out.print(i + " " + n/i + " ");
			}
		}
		
	}
	
// 3 -> Find Factor of a number using sqrt -|Both Time and Space with be O(sqrt(n)
	public static void factors3(int n) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= Math.sqrt(n); i++) {
			
			if(n % i == 0) {
				
				if(n/i == i) {
					System.out.print(i + " ");
				}
				else {
					System.out.print(i + " ");
					list.add(n/i);
				}
				
			}
		}
		
//		Collections.reverse(list); This method can also use to reverse the List
//		
//		for(int number : list) {
//			System.out.print(number + " ");
//		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		
	}
	
}
