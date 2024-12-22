package DSA_Learning;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_12_ArrayList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();

//Methods 
//		list.add(45);
//		list.add(47);
//		list.add(95);
//		list.add(256);
//		list.add(96);
//		list.add(93);
//		list.add(78);
//		
//		System.out.println(list);
//		
//		list.set(0, 85);
//		System.out.println(list);
//		
//		list.remove(2);
//		System.out.println(list);
//		
//		System.out.println(list.contains(45));
		
//Program 1
//		Program to take input from the user using for loop
		
		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(list.get(i)); // Pass index here
		}
		
		
	}
}
