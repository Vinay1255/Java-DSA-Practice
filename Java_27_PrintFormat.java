package DSA_Learning;

import java.util.ArrayList;

public class Java_27_PrintFormat {
	public static void main(String[] args) {
//		float a = 4123.4476f;
//		
//		System.out.printf("Format number is %.2f \n",a);
//		System.out.printf("The value of PI is %.5f \n", Math.PI);
//		System.out.printf("Hello my name is %s and I am a %s and I am %d year old ","Vinay Singh","Student",23);
		
		
		// Operators #########################################################################################
		
		char a = 97;
		
		System.out.println(a);
		
		System.out.println(45 + 56);
		System.out.println('a' + 'b');
		System.out.println("a" + "b");
		System.out.println('a' + 3);
		System.out.println((char)('a' + 3));
		
		System.out.println("a" + 1); 
		// This is same as after a few steps: "a" + "1"
		// Here int will be convert Integer that will be call toString();
		
		System.out.println("Vinay" + new ArrayList<>());
	}
}
