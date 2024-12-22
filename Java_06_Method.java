package DSA_Learning;

import java.util.Arrays;
import java.util.Scanner;

public class Java_06_Method {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int result = sum1(45,65);	
//		System.out.println(result);
		
//		sum2();
		
//		int result = sum3();
//		System.out.println(result);	
		
//		String message = greet();
//		System.out.println(message);
		
		
//		System.out.print("Enter your name: ");
//		String name = sc.nextLine();
//		
//		String greeting = greet2(name);
//		System.out.println(greeting);	
		
//		swap1(5, 6);
		 
//		swap2(4, 5);
		
//		int []arr = {1, 2, 3, 4, 5};
//		
//		printArray(arr); // If you make a change to the object via this reference variable same object will be changed
//		
//		System.out.println(Arrays.toString(arr));
		
		
				
	}
	
	//(Method)
	
	//Program 1
		static int sum1(int a, int b) {
			int sum = a + b;
			
			return sum;
		}
		
//		Program 2 
		static void sum2() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first number:");
			int a = sc.nextInt();
			System.out.println("Enter second number:");
			int b = sc.nextInt();
			
			int sum = a + b;
			
			System.out.println(sum);
		}
		
//		Program 3
		static int sum3() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first number:");
			int a = sc.nextInt();
			System.out.println("Enter second number:");
			int b = sc.nextInt();
			
			int sum = a + b;
			
			return sum;
			
		}
		
//		Program 4
		
		static String greet() {
			String greeting = "How are you";
			
			return greeting;
		}
		
//		Program 5
		
		static String greet2(String name) {
			String greeting = "Hello ";
			
			return greeting + name;
		}
		
//		Program 5
		
		static void swap1(int a, int b) {
			int temp = a;
			a = b;
			b = temp;
			
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		
//		Program 6
		
		static void swap2(int a, int b) {
			a = a + b; // 4 + 5 = 9
			b = a - b; // 9 - 5 = 4
			a = a - b; // 9 - 4 = 4
			
			
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		
//		Program 7
		
		static void printArray(int num[]) {
			
			num[0] = 6;
			num[1] = 7;
			num[2] = 8;
			num[3] = 9;
			num[4] = 10;
			
			for(int element : num) {
				System.out.println(element);
			}
		}
			
}
