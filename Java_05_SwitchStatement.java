package DSA_Learning;

import java.util.Scanner;

public class Java_05_SwitchStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		(Switch statement)
		
//		String fruit = sc.next();
		
//		Old method
		
//		switch(fruit) {
//		case "Mango":
//			System.out.println("King of fruit");
//			break;
//			
//		case "Apple":
//			System.out.println("A sweet red fruit");
//			break;
//			
//		case "Orange":
//			System.out.println("Round fruit");
//			break;
//			
//		case "Grapes":
//			System.out.println("small fruit");
//			break;
//			
//		default:
//			System.out.println("Please enter the valid fruit");
//		}
		
//		New method of switch statement

//Program 1
//		switch (fruit) {
//			case "Mango" -> System.out.println("A king of fruit");			
//			case "Apple" -> System.out.println("A sweet red fruit");
//			case "Orange" -> System.out.println("Round fruit");
//			case "Grapes" -> System.out.println("Small fruit");
//			default -> System.out.println("Please enter the valid fruit");
//		}
		
//Program 2

//		int day = sc.nextInt();
		
//		switch (day) {
//		case 1 -> System.out.println("Monday");
//		case 2 -> System.out.println("Tuesday");
//		case 3 -> System.out.println("Wednesday");
//		case 4 -> System.out.println("Thursday");
//		case 5 -> System.out.println("Friday");
//		case 6 -> System.out.println("Saturday");
//		case 7 -> System.out.println("Sunday");
//		default -> System.out.println("Please enter the valid number of a day");
//		}
		
//Program 3
		
//		switch (day) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("Weekday");
//			break;
//		case 6:
//		case 7:
//			System.out.println("Weekend");
//			break;
//		default:
//			System.out.println("Please enter the valid number of a day");
//		}
		
//Program 4
		
//		switch (day) {
//		 	case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//		 	case 6, 7 -> System.out.println("Weekend");
//		 	default -> System.out.println("Please enter the valid number of a day");
//		}
		
		
//		(Nested switch statement)
		
		int empId = sc.nextInt();
		String department = sc.next();

//Program 1

//		switch (empId) {
//		case 1:
//			System.out.println("Vinay Singh");
//			break;
//			
//		case 2:
//			System.out.println("Kunal Kushwaha");
//			break;
//			
//		case 3:
//			System.out.println("Employe no 3");
//			switch (department) {
//			case "IT":
//				System.out.println("IT Department");
//				break;
//				
//			case "Management":
//				System.out.println("Management Department");
//				break;
//				
//			default:
//				System.out.println("No department");
//			}
//			break;
//		
//		default:
//			System.out.println("Enter correct EmpId");
//		}
		
//Program 2
		
		switch (empId) {
		case 1 -> System.out.println("Vinay Singh");	
		case 2 -> System.out.println("Kunal Kushwaha");
		case 3 -> {
			System.out.println("Employe no 3");
			switch (department) {
			case "IT" -> System.out.println("IT Department");
			case "Management" -> System.out.println("Management Department");
			default -> System.out.println("No department");			
			}
		}
		default ->System.out.println("Enter correct EmpId");
		}
		
		
	}
}
