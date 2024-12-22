package DSA_Learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Java_13_MultiDemensionArrayList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
//Initialisation
		
//		for(int i = 0; i < 3;i++) {
//			list.add(new ArrayList<>());
//		}
		
//Take the element for MultiDemension ArrayList
		
		System.out.println("Enter the number");
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				list.get(i).add(sc.nextInt());
//			}
//		}
		
		list.add(new ArrayList());
		list.get(0).add(1);
		list.get(0).add(2);
		list.get(0).add(3);
		list.add(new ArrayList());
		list.get(1).add(4);
		list.get(1).add(5);
		list.get(1).add(6);
		list.add(new ArrayList());
		list.get(2).add(7);
		list.get(2).add(8);
		list.get(2).add(9);
		
		System.out.println(list);
		
	}
}
