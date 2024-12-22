package DSA_Learning;

import java.util.Scanner;

public class Java_01_Conditionals {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		(if else statement)
//		
//		System.out.println("Enter your salary:");
//		float Salary = sc.nextFloat();
//		
//		if(Salary>10000) 
//			Salary += 2000;
//		else
//			Salary += 1000;
//		
//		
//		System.out.println("Your total salary is " + Salary);
//			
		
//		(Multiple if else statement)
		
//		System.out.println("Enter your salary:");
//		float Salary = sc.nextFloat();
//		
//		if(Salary > 10000)
//			Salary += 2000;
//		else if(Salary > 20000)
//			Salary += 3000;
//		else
//			Salary += 1000;
//		
//		System.out.println(Salary);
		
//		(Find the largest number)
		
//		System.out.println("Enter the value of a, b and c:");
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
		

//Program 1		
//		if(a > b && a > c)
//			System.out.println(a);
//		else if(b > a && b > c)
//			System.out.println(b);
//		else if(c > a && c > b)
//			System.out.println(c);
//		else
//			System.out.println("Unexcapted argument:");
//		

//Program 2
//		int max = a;
//		
//		if(max < b)
//			max = b;
//		if(max < c)
//			max = c;
//		
//		System.out.println(max);
		
//Program 3
		
//		int max = Math.max(c, Math.max(a, b));
//		System.out.println(max);
		
//		(Case check of char)
		
//		System.out.println("Enter char value:");
//		
//		char ch = sc.next().trim().charAt(0);
//		
//		if (ch >= 'a' && ch <= 'z') {
//			System.out.println("Lower case");
//		}
//		else {
//			System.out.println("Upper case");
//		}
//		
//		System.out.println(ch);
//		
		
//		(Calculato program)
		
		int ans = 0;
		
		while(true) {
//			Take operator as input
			
			System.out.println("Enter the operator: ");
			char op = sc.next().trim().charAt(0);
			
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				
//				Input two numbers
				
				System.out.println("Enter two numbers: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				if(op == '+') {
					ans = num1 + num2;
				}
				if(op == '-') {
					ans = num1 - num2;
				}
				if(op == '*') {
					ans = num1 * num2;
				}
				if(op == '/') {
					if(num1 != 0 || num2 != 0) {
						ans = num1 / num2;
					}
				}
				if(op == '%') {
					ans = num1 % num2;
				}
				
			}
			else if(op == 'x' || op == 'X') {
				System.out.println("Exit:");
				break;
			}
			else {
				System.out.println("Unexcepted Argument:");
			}
			
			System.out.println(ans);
			
		}
		
	}
}
