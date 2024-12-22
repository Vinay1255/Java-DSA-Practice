package DSA_Learning;

import java.util.Arrays;
import java.util.Scanner;

public class Java_09_Arrays {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int[] marks = new int[5];
		
////		Take a input of int type of arrays
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println("Enter the marks " + (i+1));
//			marks[i] = sc.nextInt();
//		}	
//		
//		for (int i : marks) {
//			System.out.print(i + " "); // Here i is represent element of array
//		}
		
//		System.out.println(Arrays.toString(marks)); // Print arrays using Arrays.toString();
		
		String[] name = new String[5];
		
//		Take a input of String type of arrays
		for (int i = 0; i < name.length; i++) {
			System.out.println("Enter the name of Student " + (i+1));
			name[i] = sc.next();
		}	

//		Modify String Arrays
		name[0] = "Vinay Singh";
		
		for (String i : name) {
			System.out.print(i + ", "); // Here i is represent element of array
		}
	
		
	}
}
